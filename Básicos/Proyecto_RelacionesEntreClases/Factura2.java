import java.util.ArrayList;

public class Factura2 {
    ArrayList<Detalle> deta = new ArrayList<>();
    private int numeroFactura;

    public Factura2(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void agregarDetalles(Detalle deta) {
        this.deta.add(deta);
    }

    public void listarFactura() {

        for (Detalle detalle : deta) {
            // tipo de dato Articulo de nombre articulo = instancia de clase.metododo
            Articulo articulo = detalle.getArticulo();
            String nombreArticulo = articulo.getNombre();
            int Cantidad = detalle.getCantidad();
            Double ValorUnitario = articulo.getPrecio_unit();
            double Subtotal = ValorUnitario * Cantidad;

            System.out.println("nombre articulo" + nombreArticulo);
            System.out.println("cantidad " + Cantidad);
            System.out.println("valor unitario " + ValorUnitario);
            System.out.println("sub total " + Subtotal);

            /// public Articulo(String nombre, Double precio_unit, Double iva)
        }
    }
}
