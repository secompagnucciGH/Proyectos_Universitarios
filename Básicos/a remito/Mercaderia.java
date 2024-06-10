/**
 * Mercaderia Class
 *
 * Almacena el nombre y precio unitario de cada
 * artículo (Ej: Nombre: “Yerba La Verde”, Precio: 310)
 */
public class Mercaderia {
    private String nombre;
    private double precio_unit;

    /**
     * Constructor
     *
     * Crea una instancia recibiendo los datos por
     * parámetros.
     */
    public Mercaderia(String nombreProducto, double precioProducto) {
        if (precioProducto > 0) {
            this.nombre = nombreProducto;
            this.precio_unit = precioProducto;
        } else {
            System.out.println("No se puede crear el producto con un precio menor a cero!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio_unit() {
        return precio_unit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio_unit(double precio_unit) {
        this.precio_unit = precio_unit;
    }
}