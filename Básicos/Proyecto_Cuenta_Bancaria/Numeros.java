
/**
 * Write a description of class Numeros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numeros
{
    // instance variables - replace the example below with your own
    private int x;
    

    /**
     * Constructor for objects of class Numeros
     */
    public Numeros()
    {
        
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void ejemploNumeros()
    {
        byte b = 127;
        //System.output.println(""");  //como mostrsr omillas dobles por pantalla?
        System.out.println("tabulador"+"\t"+"separado"); // tabula hacia la derecha 
        System.out.print(" \b ");            // tabula hacia la derecha la proxima impresión
        System.out.print(" Hola "+"\n");        // imprime y luego salta de línea
        System.out.print(" que tal? "+"\n");    // imprime y luego salta de línea
        System.out.print(" \" ");            // imprime  comillas dobles "
        System.out.print(" \u0027 es una comilla simple");        // imprime  comillas simples
        int i = 123456;
        double d = 123456.1234567;  
        
        long ln = i;    // de entero a long
        double di = i;  // de entero a double 
        // int id = ln;  // error 
        
         System.out.println(" PI"+Math.PI);   
         
           System.out.println("\"");
        
    }
    
     public void ejemploCasting()
    {
       
        int n;     
        double x = 82.4;
        n = (int) x;  // por Casting
        //n = x; // error por asignacion
        System.out.print("n:"+n);    
        
    }
    
        public  void conversiones  () {
        int a = 2;
        double b = 3.0;
        float c = (float) (20000*a/b + 5);
        System.out.println("Valor en formato float: " + c);
        System.out.println("Valor en formato double: " + (double) c);
        System.out.println("Valor en formato byte: " + (byte) c);
        System.out.println("Valor en formato short: " + (short) c);
        System.out.println("Valor en formato int: " + (int) c);
        System.out.println("Valor en formato long: " + (long) c);
    }

    
    
    
}
