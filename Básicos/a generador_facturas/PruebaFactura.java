public class PruebaFactura {

    public PruebaFactura(int NumF, int Imp, String Client) {
        // Crear una instancia de la clase Factura
        Factura factura = new Factura(NumF,Imp,Client);

        // Imprimir los detalles de la factura
        System.out.print("Número de Factura: " + factura.getNumeroFactura()+ " ");
        System.out.print("Importe: " + factura.getImporte()+ " ");
        System.out.print("Nombre del Cliente: " + factura.getNombreCliente() + " ");

        // Calcular el neto para diferentes tipos de pago
        
        System.out.println("Factura Nro: " + factura.getNumeroFactura() + " Importe:" + factura.getImporte());
        System.out.println("Tipo de Pago: Contado, Neto: " + factura.calcularNeto(0));
        System.out.println("Tipo de Pago: Débito, Neto: " + factura.calcularNeto(1));
        System.out.println("Tipo de Pago: Crédito, Neto: " + factura.calcularNeto(2));
        System.out.println("Tipo de Pago: Billetera virtual, Neto: " + factura.calcularNeto(3));
        System.out.println("Tipo de Pago Incorrecto, Neto: " + factura.calcularNeto(4));
    }
}