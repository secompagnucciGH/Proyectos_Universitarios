
/**
 * Write a description of class PruebaCuentaBancaria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PruebaCuentaBancaria {
    
    public void PruebaCuentaBancaria () {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.totalCuentas++; // accede a la variable de clase
        System.out.println("Total cuentas: " + c1.totalCuentas);
        CuentaBancaria c2 = new CuentaBancaria();
        c2.totalCuentas++; // accede a la variable de clase
        System.out.println("Total cuentas: " + c2.totalCuentas+"Total saldo: " +c2.saldo);
        CuentaBancaria.totalCuentas++; // Acceso a través de la clase:
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);
        
        int x = 4;
        double  b = x; 
        System.out.println("valor de b " + b);
        int n; double x1 = 82.4; n = (int) x1;
    }
}