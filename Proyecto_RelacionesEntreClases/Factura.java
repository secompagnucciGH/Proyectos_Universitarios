import java.util.ArrayList;

public class Factura {
    private int numero;
    private ArrayList<Detalle> detalles;

    public Factura(int numero) {
        this.numero = numero;
        this.detalles = new ArrayList<Detalle>();
    }

    public void agregarDetalles(Detalle detalle) {
        detalles.add(detalle);
    }

    public void listarFactura() {
        System.out.println("Factura Nro: " + numero + " Apellido y Nombre: Juan Marangoni");
        System.out.println("Articulo \t Cantidad \t Pr. Uni. \t IVA \t  Total s/IVA");

        double totalSinIVA = 0;
        double totalIVA = 0;

        for (Detalle detalle : detalles) {
            Articulo articulo = detalle.getArticulo();
            String nombre = articulo.getNombre();
            int cantidad = detalle.getCantidad();
            Double precioUnitario = articulo.getPrecio_unit();
            double iva = articulo.getIva();
            double precioTotalSinIVA = cantidad * precioUnitario;
            double precioTotalConIVA = precioTotalSinIVA + (precioTotalSinIVA * (iva / 100.0));

            totalSinIVA += precioTotalSinIVA;
            totalIVA += (precioTotalSinIVA * (iva / 100.0));

            System.out
                    .println(nombre + "\t" + cantidad + "\t" + precioUnitario + "\t" + iva + "\t" + precioTotalSinIVA);
        }

        System.out.println("TOTAL $ " + totalSinIVA);
        System.out.println("Total IVA $ " + totalIVA);
        System.out.println("TOTAL c/IVA $ " + (totalSinIVA + totalIVA));
    }
}