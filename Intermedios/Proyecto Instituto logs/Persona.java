
/**
 * Esta clase permitirá modelar las diferente "personas"
 * que interactúan. Actuará de superclase
 * para las clases Docente, Estudiante, etc.
 * Se declara como abstracta para que no se puedan
 * crear instancias, sino que solamente sirva como
 * superclase.
 * Implementa la interface Comparable para ordenar
 * las distintas personas en orden natural por nombre.
 * 
 * @author (Mario Finos) 
 * @version (V1)
 */
public abstract class Persona implements Comparable<Persona>, ILogable
{
    // definición de variables de instancia
    private String nombre;
    private int dni;
    private String fechaNac;
    private String fechaIng;
    
    /**
     * Constructor de objetos de la clase Persona
     */
    public Persona()
    {
    }

    /**
     * Constructor de objetos de la clase Persona
     *
     * @param  int dni El dni de la persona
     */ 
    public Persona(int dni)
    {
        this.dni = dni;
    }

    /**
     * Método setNombre
     * 
     * @param  String nombre El nombre de la persona
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Método setDni
     * 
     * @param  int dni El dni de la persona
     */
    public void setDni(int dni)
    {
        this.dni = dni;
    }

    /**
     * Método setFechaDeNacimiento
     * 
     * @param  String fechaNac La fecha de nacimiento de la persona
     */
    public void setFechaDeNacimiento(String fechaNac)
    {
        this.fechaNac = fechaNac;
    }

    /**
     * Método setFechaDeIngreso
     * 
     * @param  String fechaIng La fecha de ingreso de la persona
     */
    public void setFechaDeIngreso(String fechaIng)
    {
        this.fechaIng = fechaIng;
    }

    
    /**
     * Método getNombre
     * 
     * @return  String  El nombre de la persona
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Método getDni
     * 
     * @return  int  El dni de la persona
     */
    public int getDni()
    {
        return dni;
    }

    /**
     * Método getFechaDeNacimiento
     * 
     * @return  String  La fecha de nacimiento de la persona
     */
    public String getFechaDeNacimiento()
    {
        return fechaNac;
    }

    /**
     * Método getFechaDeIngreso
     * 
     * @return  String  La fecha de ingreso de la persona
     */
    public String getFechaDeIngreso()
    {
        return fechaIng;
    }

    /**
     * Método toString redefine al de la clase superior
     * 
     * @return  String  La cadena con toda la informacion
     *                  asociada a las variables de instancia
     */
    @Override
    public String toString()
    {
        return "  Nombre         :" + nombre 
             + "\n  DNI            :" + dni
             + "\n  Fecha de Nacim.:" + fechaNac
             + "\n  Fecha de Ingr. :" + fechaIng;
    }
    
    /**
     * Método queSoy
     * Se declara como abstracto a fin de obligar
     * a todas las subclases a implementarlo
     * (sobreescribirlo)
     * 
     * @return  String  El nombre de la clase
     */
    public abstract String queSoy();
    
    /**
     * Método compareTo que sobreescribe el método
     * de la interface Comparable
     * A este método lo utiliza el método "sort" de
     * la clase "Collections".
     */
    @Override
    public int compareTo(Persona o) {
        //retorna el entero que devuelve el método
        //compareTo de la clase String (tipo de dato
        //de las variables nombre).
        return this.nombre.compareTo(o.nombre);
    }
    
    public String logString() {
        return "  ||  " + nombre 
             + "  ||  " + dni
             + "  ||  " + fechaNac
             + "  ||  " + fechaIng;
    }
}