import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
/**
 * Esta clase permite probar la clase HashMapArticulo.
 * 
 * @author (Mario Finos) 
 * @version (V1)
 */
public class PruebaHashMapArticulo
{
    // define una variable de instancia del tipo de la clase a probar
    private  HashMapArticulo hmArticulos;

    /**
     * Constructor de objetos de la clase PruebaHashMapArticulo
     */
    public PruebaHashMapArticulo()
    {
        // Crea una instancia de la clase
        hmArticulos = new HashMapArticulo();
        // Agrega 3 artículos
        hmArticulos.agregarArticulo(1, "Azucar");
        hmArticulos.agregarArticulo(6, "Yerba");
        hmArticulos.agregarArticulo(234, "Cafe");
        // Busca e imprime la cantidad de articulos almacenados
        System.out.println("------------------------------------------");  
        System.out.println("La cantidad de artículos es: "
                           + hmArticulos.obtenerTamanio());
        // Busca e imprime la descripcion del artículo 6
        System.out.println("------------------------------------------");  
        System.out.println("Busqueda directa de un artículo");
        System.out.println("El codigo 6 corresponde a: "
                           + hmArticulos.buscarArticulo(6));
        System.out.println("------------------------------------------");                           
        // Recorre todo la información del mapa con un ciclo for-each
        System.out.println("Recorre todos los artículos con for-each");
        for (Entry articulo : hmArticulos.getArticulos().entrySet()) {
            System.out.println("Articulo: " + articulo.getKey() + " - " +
                                articulo.getValue());
        }
        System.out.println("------------------------------------------");          
        // Recorre todo la información del mapa con un iterator
        System.out.println("Recorre todos los artículos con iterator");
        Iterator<Entry<Integer, String>> articulos = 
                          hmArticulos.getArticulos().entrySet().iterator();
        while (articulos.hasNext()) {
            Entry<Integer, String> articulo = articulos.next();
            System.out.println("Articulo: " + articulo.getKey() + " - " +
                                articulo.getValue());
        }
        System.out.println("------------------------------------------");          
                
    }
}
