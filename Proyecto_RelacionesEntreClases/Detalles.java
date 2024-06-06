import java.util.*;

/*lase: Detalle
• EL constructor debe recibir por parámetro, valores de todos
sus atributos.
• Realizar los métodos get y set para cada campo (artículo y
cantidad).
 */
public class Detalles
{
    private Articulos articulo;
    private int cantidad;
    
    
    public Detalles(Articulos articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }
    
    public Articulos getArticulo() { // Cambia el tipo de retorno a Articulos
        return articulo;
    }
}
