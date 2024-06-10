public class PruebaVenta {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 25.5);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 20.0);

        // Crear una venta
        Venta venta = new Venta(2);

        // Agregar libros a la venta
        venta.addLibro(libro1);
        venta.addLibro(libro2);

        // Mostrar detalles de la venta
        venta.calcularTotal();
        
        venta.mostrarDetalles();
    }
}