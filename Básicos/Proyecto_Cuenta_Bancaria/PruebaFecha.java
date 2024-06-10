
/**
 * Write a description of class PruebaFecha here.
 * 
 * @author jose
 * @version 1.0.0
 */
public class PruebaFecha
{
    // instance variables - replace the example below with your own
    private Fecha f1;
    
    /**
     * Constructor for objects of class PruebaFecha
     */
    public PruebaFecha()
    {
        f1 = new Fecha();// initialise instance variables
        System.out.println("Dia de la fecha"+f1.getDia());
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void muestraFecha()
    {
        f1.muestra();
    }
}
