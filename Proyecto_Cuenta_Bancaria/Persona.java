
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // propiedades de la clase 
    private  int            edad;
    private String          nombre;      
    private static String   a="valor de Clase";

    /**
     * Constructor for objects of class Persona
     */
    public Persona(int e, String n)
    {
        this.edad=e;
        this.nombre = n;
        
    }

     public Persona(String n)
    {
        this.edad=0;
        this.nombre = n;
        
    }
    
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getEdad()
    {
          return edad;
    }
    public String getNombre()
    {
          return nombre;
    }
    
    
    public void setEdad(int edad)
    {
        edad=edad;
    }
    
      
    public void setNombre(String n)
    {
          nombre=n;
          muestraMensaje("El nombre de ha actualizado correctamente: "+nombre);
    }
    
    private void muestraMensaje(String mensaje)
    {        
        System.out.println(mensaje);
    }
    
    
   public static void mustraMensaje2(String mensaje)
   {          System.out.println(mensaje);
   }
   
   public static void seta(String valor)
   {          a=valor;
   }
   
   public void muestraa()
   {   System.out.println(a);
       int a = 2;
   }
    
   public void llamaSumar()
   {    
       int v = 9;
       int suma = sumar(v, 5);
       System.out.println(suma);
   }
   
   
   private  int sumar(int a, int b)
   {          
       int suma = a+b;
       return suma;
             
   }
}
