
/**
 * Write a description of class PruebaCtaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaCuentaBancaria {
  /**
  * Metodo constructor
  * 
  */
    public  PruebaCuentaBancaria () {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.totalCuentas++;                     // accede a la variable de clase
        System.out.println("Total cuentas: " + c1.totalCuentas);
 
        CuentaBancaria c2 = new CuentaBancaria();
        c2.totalCuentas++;            // accede a la variable de clase
        System.out.println("Total cuentas: " + c2.totalCuentas);

        CuentaBancaria.totalCuentas++;                    // Acceso a través de la clase:
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);
    }
    
     public void abreCuentaBancaria () {                          
            CuentaBancaria.totalCuentas++;                    // Acceso a través de la clase:
            System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);
    }
    
     public void muestraVclase() {                          
        //System.out.println("Total cuentas: " + CuentaBancaria.vclase);  // para vclase es public
        System.out.println("Total cuentas: " + CuentaBancaria.getVclase());  // para vclas privada
    }
   
}


