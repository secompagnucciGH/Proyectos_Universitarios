
/**
 * Write a description of class Prueba here.
 * 
 * @author jlc
 * @version 1.0.0
 */
public class Prueba
{
    // instance variables - replace the example below with your own
    private Persona p;
    
    private Persona p1;

    /**
     * Constructor for objects of class Prueba
     */
    public Prueba(int edad, String nombre)
    {
        // initialise instance variables
        p = new Persona(edad, nombre);
        p1 = p;
    }

    
    public void mostrarNombre()
    {
        System.out.println("El nombre es: "+p.getNombre());
        Persona.mustraMensaje2("este mensaje es de la clase Persona");
        int g = 8; 
   }
   
   public void muestraPuntero()
    {
        System.out.println("P : "+p);
        System.out.println("P1: "+p1);
   }
   
}
