
/**
 * Clase destinada a modelar un perro, almacena su nombre
 * y su edad.
 * 
 * @author (Sebastian Compagnucci) 
 * @version (1.0.0)
 */
public class Perro
{
    //variables de instancia, contienen la información
    //a guardar por cada instancia creada
    private String nombre;
    private int edad;

    /**
     * Constructor sin parámetros de la clase Perro
     */
    public Perro()
    {
        //inicializa las varibles de instancia
        nombre = null;
        edad = 0;
    }

    /**
     * Método que permite asignar el nombre al perro
     * 
     * @param Nombre El nombre a asignar al perro
     */ 
    public void setNombre(String nombre)
    {
        //asigna el valor recibido en el parámetro
        //a la variable de instancia
        this.nombre = nombre;
    }

    /**
     * Método que permite obtener el nombre del perro
     * 
     * @return String El nombre del perro
     */ 
    public String getNombre() {
        //retorna el valor de la variable de instancia
        return nombre;
    }
    
    /**
     * Método que permite asignar la edad al perro
     * 
     * @param Edad La edad a asignar al perro
     */ 
    public void setEdad(int edad)
    {
        //asigna el valor recibido en el parámetro
        //a la variable de instancia
        this.edad = edad;
    }
    
    /**
     * Método que permite obtener la edad del perro
     * 
     * @return int La edad del perro
     */ 
    public int getEdad() {
        //retorna el valor de la variable de instancia
        return edad;
    }
    
    /**
     * Método que permite imprimir todos los
     * datos del perro
     */ 
    public void impirmirDatos() {
        //concatena e imprime en la terminal de texto
        //un mensaje conteniendo los datos del perro
        System.out.println("El nombre del perro es " 
                  + nombre + " y tiene " + edad + " años");
    }

}
