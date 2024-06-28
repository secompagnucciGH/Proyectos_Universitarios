import java.util.HashMap;
/**
 * Esta clase permitirá modelar las diferentes "materias"
 * de la carrera de la Institución. 
 * 
 * @author (Mario Finos) 
 * @version (Version 1.0)
 */
public class Materias
{
    // un mapa conteniendo el nombre de la materia y 
    // la cantidad de horas semanales que le corresponde
    private HashMap<String, Integer> materias;

    /**
     * Constructor de objetos de la clase Materias
     */
    public Materias()
    {
        // se inicializa el mapa completo
        materias = new HashMap<String, Integer>();
        materias.put("Lógica y estructura de Datos",4);
        materias.put("Matemática I",4);
        materias.put("Programación 1",6);
        materias.put("Programación 2",6);
    }

    /**
     * Método esMateriaValida
     * 
     * @param  String materia  La materia que se desea validar
     *                       su existencia en la lista 
     * @return  boolean   Retorna true si la materia existe en
     *                    la lista, caso contrario retorna false     
     */
    public boolean esMateriaValida(String materia)
    {
        return materias.containsKey(materia);
    }

    /**
     * Método getHoras
     * 
     * @param  String materia  La materia que se desea obtener
     *                       su cantidad de horas semanales
     * @return  Integer   La cantidad de horas semanales correspondientes,
     *                   si la materia no es válida retorna null
     */
    public Integer getHoras(String materia)
    {
        if (esMateriaValida(materia))
           return materias.get(materia);
        else
           return null;
    }

}