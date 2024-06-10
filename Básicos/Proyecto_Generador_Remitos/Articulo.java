
/**
1°) 
Crear la clase Articulo (almacena el nombre, precio unitario y stock de
cada artículo (Ej: Nombre: “Yerba La Verde”, Precio: 310, Stock: 300 )
El constructor debe permitir crear una instancia recibiendo los 3 datos por
parámetros.
El campo stock, al crear la instancia, genera el stock inicial del artículo
El método actualizaStock(int cantidad) , lo que hace es recibir un dato entero y
sumarlo al campo stock. De esta manera se mantiene actualizado el campo stock
del artículo. 
 */
public class Articulo
{
    private String nombre;
    private double precioUnitario;
    private int stock;

    /**
     * Constructor for objects of class Articulo
     */
    public Articulo(String nombre, double precioUnitario, int stock){
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        }

    public int getStock() {
        return stock;
        }
    
    public void actualizaStock(int cantidad) {
        this.stock += cantidad;
    }
    
    public String getNombre() {
        return nombre;
        }

    public double getPrecioUnitario() {
        return precioUnitario;
        }
}



