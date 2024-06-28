
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
        Materias materias = new Materias();
        if (materias.esMateriaValida(materia)) {
           this.materia = materia;
        }   
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
    public String queSoy()
    {
        return QUE_SOY;
    }  

    /**
     * Método calcularSueldo redefine al de la 
     * clase superior
     * 
     * @param  int mes El número de mes para el que se 
     *                 calcula el sueldo
     */
    @Override
    public void calcularSueldo(int mes)
    {
        Materias materias = new Materias();
        Integer horas = materias.getHoras(materia);
        if (horas != null) {
            this.setSueldoMensual(horas * 800);
        }    
    }    
    
    @Override
    public String getInfoInicial() {
         return System.currentTimeMillis() + " || " + queSoy();
    }
    
    @Override
    public String getEventoLogable() {
         return super.logString() + " || " + materia;
    }
}
