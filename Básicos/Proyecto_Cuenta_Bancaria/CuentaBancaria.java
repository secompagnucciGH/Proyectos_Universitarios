
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author jlc
 * @version 1.0.0 
 */
public class CuentaBancaria
{
     private double saldo;                // Variable de instancia
     public static int totalCuentas = 0; 
     
     private static int vclase = 0;

    /**
     * Constructor de la clase CuentaBancaria
     */
    public CuentaBancaria()
    {
        saldo = 0;
        totalCuentas++;    // totalCuentas=totalCuentas+1
    }

   
    /**
     * Get de la Variable de Clase 
     * @return     vclase
     */
    public  static int getVclase() {
        return vclase;
    }
    
    /**incrementa Total de Cuentas 
     * Metodo de clase 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public  static   void  incTotalCuentas() {
        totalCuentas++;
    }
  
}
