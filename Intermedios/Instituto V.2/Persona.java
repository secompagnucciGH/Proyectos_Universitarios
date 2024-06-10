
/**
 * Esta clase permitirá modelar las diferente "personas"
 * que interactúan. Actuará de superclase
 * para las clases Docente, Estudiante, etc.
 * 
 * @author (Mario Finos) 
 * @version (V1)
 */
public class Persona
{
    // definición de variables de clase
    private static final String QUE_SOY = "Persona";
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
     * 
     * @return  String  El nombre de la clase
     */
    public String queSoy()
    {
        return QUE_SOY;
    }  
}