public class Prueba {
    public static void main(String[] args) {
        // Crear instancias de Articulo
        Articulo manteca = new Articulo("Manteca", 3.0, 10.5);
        Articulo yerba = new Articulo("Yerba", 250.0, 21.5);
        Articulo azucar = new Articulo("Azúcar", 80.0, 10.5);

        // Crear instancias de Detalle
        Detalle detalle1 = new Detalle(manteca, 3);
        Detalle detalle2 = new Detalle(yerba, 2);
        Detalle detalle3 = new Detalle(azucar, 1);

        // Crear instancia de Factura
        Factura factura = new Factura(1234);

        // Agregar detalles a la factura
        factura.agregarDetalles(detalle1);
        factura.agregarDetalles(detalle2);
        factura.agregarDetalles(detalle3);

        // Listar la factura
        factura.listarFactura();
    }
}





