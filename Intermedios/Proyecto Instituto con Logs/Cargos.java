import java.util.HashMap;
/**
 * Esta clase permitirá modelar las diferentes "cargos"
 * de los directivos de la Institución. 
 * 
 * @author (Mario Finos) 
 * @version (Version 1.0)
 */
public class Cargos
{
    // un mapa conteniendo el nombre del cargo y 
    // el sueldo mensual que le corresponde
    private HashMap<String, Double> cargos;

    /**
     * Constructor de objetos de la clase Cargos
     */
    public Cargos()
    {
        // se inicializa el mapa completo
        cargos = new HashMap<String, Double>();
        cargos.put("Director",30000.00);
        cargos.put("Gerente",20000.00);
        cargos.put("Subdirector",25000.00);
        cargos.put("Administrador",18500.00);
    }

    /**
     * Método esCargoValido
     * 
     * @param  String cargo  El cargo que se desea validar
     *                       su existencia en la lista 
     * @return  boolean   Retorna true si el cargo existe en
     *                    la lista, caso contrario retorna false
     */
    public boolean esCargoValido(String cargo)
    {
        return cargos.containsKey(cargo);
    }

    /**
     * Método getSueldo
     * 
     * @param  String cargo  El cargo que se desea obtener el
     *                       sueldo mensual 
     * @return  Double   El sueldo que le corresponde al cargo,
     *                   si el cargo no es válido retorna null
     */
    public Double getSueldo(String cargo)
    {
        if (esCargoValido(cargo))
           return cargos.get(cargo);
        else
           return null;
    }

}
