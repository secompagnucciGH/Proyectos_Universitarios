import java.util.HashMap;
/**
 * Esta clase utiliza un HashMap para almacenar el código y
 * la descripción de una lista de artículos.
 * 
 * @author (Sebastian Compagnucci) 
 * @version (V1)
 */
public class HashMapArticulo
{
    private HashMap<Integer,String> articulos;

    /**
     * Constructor de objetos de la clase HashMapArticulo
     */
    public HashMapArticulo()
    {
        articulos = new HashMap<Integer,String>();
    }

    /**
     * Método agregarArticulo
     * Permite ingresar un artículo a la lista.
     * @param numero El número de artículo que representa el código
     * @param descripcion La descripción del artículo
     */
    public void agregarArticulo(int numero, String descripcion)
    {
        // Invoca al método "put" de HashMap que permite
        // agregar un elemento a la colección.
        articulos.put(numero, descripcion);
    }

    /**
     * Método buscarArticulo
     * Permite obtener la descripción de un artículo almacenado
     * en la lista por medio del número (código).
     * @param numero El número de artículo a buscar
     * @return Una cadena que representa la descripción del artículo.
     */
    public String buscarArticulo(int numero)
    {
        // Invoca al método "get" de HashMap que permite
        // buscar por la "clave" un elemento a la colección.
        return articulos.get(numero);
    }

    /**
     * Método obtenerTamanio
     * Permite obtener la cantidad de artículos almacenados
     * en la lista.
     * @return Un entero que representa la cantidad del artículos.
     */
    public int obtenerTamanio()
    {
        return articulos.size();
    }

    /**
     * Método getArticulos
     * Permite retornar la lista completa de artículos almacenados.
     * @return Un HashMap con la lista de artículos.
     */
    public HashMap<Integer, String> getArticulos()
    {
        return articulos;
    }
}
