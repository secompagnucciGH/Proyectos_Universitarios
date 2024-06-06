import java.util.*;

public class Venta
{
    private int cantidadVentas;
    private Libro libro;
    private ArrayList<Libro> ListaVentas;
    /**
     Crea una clase Venta que represente una venta de libros.
 
     Una venta consiste en un libro y la cantidad de copias vendidas.
     */
    public Venta(int cantidadVentas)
    {
        this.cantidadVentas = cantidadVentas;
        ListaVentas = new ArrayList<>();
    }
    
    public void addLibro(Libro libro){
        ListaVentas.add(libro);
    }
    
    /**
     * La clase Venta debe contener un método calcularTotal() 
     * que calcule y devuelva el monto total de la venta, 
     * multiplicando el precio del libro por la cantidad de copias vendidas.
     
    La clase Venta debe tener un método mostrarDetalles() 
    que muestre por pantalla los detalles de la venta, incluyendo 
    el título del libro, el autor, la cantidad vendida, el precio unitario y el monto total de la venta.
     */
    
    public double calcularTotal() {
        double totalVenta = 0;
        for (Libro libro : ListaVentas) {
            totalVenta += libro.getPrecio();
        }
        return totalVenta;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de la venta:");
        for (Libro libro : ListaVentas) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Precio unitario: " + libro.getPrecio());
            System.out.println("-----------------------");
        }
        System.out.println("Monto total de la venta: " + calcularTotal());
    }
    }
