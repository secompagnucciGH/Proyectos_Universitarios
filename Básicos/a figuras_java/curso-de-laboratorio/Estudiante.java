
/**
 * La clase Estudiante representa un estudiante en un sistema de administración de estudiantes.
 * Contiene los datos relevantes de los alumnos en nuestro contexto.
 * 
 * @author Michael Kolling and David Barnes
 * @version 2006.03.30
 *
 * Traductores: Jose Cardilli y Mario Finos
*/
public class Estudiante
{
    // nombre completo del estudiante
    private String nombre;
    // identificacion del estudiante
    private String id;
    // cantidad de créditos para estudios adoptadas hasta el momento
    private int creditos;

    /**
     * Crea un nuevo estudiante con un nombre determinado y número de identificación.
     */
    public Estudiante(String nombreCompleto, String estudianteID)
    {
        nombre = nombreCompleto;
        id = estudianteID;
        creditos = 0;
    }

    /**
     * Retorna el nombre completo de este estudiante.
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para este estudiante.
     */
    public void cambiarNombre(String nuevoNombre)
    {
        nombre = nuevoNombre;
    }

    /**
     * Devuelve el ID de estudiante de este estudiante.
     */
    public String obtenerEstudianteID()
    {
        return id;
    }

    /**
     * Agrega algunos puntos de crédito a los créditos acumulados del estudiante.
     */
    public void agregarCreditos(int puntosAdicionales)
    {
        creditos += puntosAdicionales;
    }

    /**
     * Devuelve el número de créditos acumulados por este estudiante.
     */
    public int obtenerCreditos()
    {
        return creditos;
    }

    /**
     * Devuelve el nombre de conexión de este estudiante. El nombre de conexión es una combinación
     * de los cuatro primeros carácteres del nombre del estudiante y los primeros tres
     * carácteres del número de identificación del estudiante.
     */
    public String obtenerLoginNombre()
    {
        return nombre.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Imprime el nombre del estudiante y el número de identificación en la terminal de salida.
     */
    public void imprimir()
    {
        System.out.println(nombre + " (" + id + ")");
    }
}
