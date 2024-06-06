
/**
 * Write a description of class CuentaBancaria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
    
    public double saldo; // Variable de instancia
       public static int totalCuentas=0;
    /**
     * Constructor for objects of class CuentaBancaria
     */
    public CuentaBancaria()
    {
       
    }

     public void aumentaSaldo(double d)
    {
       saldo=saldo+d;
    }
}
