
/**
 * Esta clase permitirá modelar un docente,utiliza
 * como superclase a la clase Empleado.
 * 
 * @author (Mario Finos) 
 * @version (V2)
 */
public class Docente extends Empleado
{
    // definición de variables de clase
    private static final String QUE_SOY = "Docente";
    // definición de variables de instancia
    private String materia;
    
    /**
     * Constructor de objetos de la clase Docente
     */
    public Docente()
    {
        super();
    }

    /**
     * Constructor de objetos de la clase Docente
     *
     * @param  int dni El dni de la persona
     */
    public Docente(int dni)
    {
        super(dni);
    }

    /**
     * Método setMateria
     * 
     * @param  String materia La materia que dicta el docente
     */
    public void setMateria(String materia)
    {
        this.materia = materia;
    }
    
    /**
     * Método getMateria
     * 
     * @return  String  La materia que dicta el docente
     */
    public String getMateria()
    {
        return materia;
    }

    /**
     * Método toString redefine al de la clase superior
     * 
     * @return  String  La cadena con toda la informacion
     *                  asociada a las variables de instancia
     */
    @Override
    public String toString()
    {
        return super.toString()
             + "\n  Materia        :" + materia;
    }
    
    /**
     * Método queSoy
     * 
     * @return  String  El nombre de la clase
     */
    @Override
    public String queSoy()
    {
        return QUE_SOY;
    }  
}
