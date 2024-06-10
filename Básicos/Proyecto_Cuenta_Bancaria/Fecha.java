
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int anio;
    
    /**
     * Constructor for objects of class Fecha
     */
    public Fecha()
    {
        dia=2;
        mes=12;
        anio=2091;
    
    }

    public Fecha(int d, int m, int a)
    {
        dia=d;
        mes=m;
        anio=a;
        
        
    }
        
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void muestra()
    {
        System.out.print("Dia: "+dia+" mes: "+mes+" año: "+anio);
    }
    
    public int getDia()
    {
        return dia;
    }
    
}
