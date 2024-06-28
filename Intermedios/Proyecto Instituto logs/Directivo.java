/**
 * Esta clase permitirá modelar un empleado 
 * directivo, utiliza
 * como superclase a la clase Empleado.
 * 
 * @author (Mario Finos) 
 * @version (V2)
 */
public class Directivo extends Empleado
{
    // definición de variables de clase
    private static final String QUE_SOY = "Directivo";
    // definición de variables de instancia
    private String cargo;

    /**
     * Constructor de objetos de la clase Directivo
     */
    public Directivo()
    {
        super();
    }

    /**
     * Constructor de objetos de la clase Directivo
     *
     * @param  int dni El dni de la persona
     */
    public Directivo(int dni)
    {
        super(dni);
    }

    /**
     * Método setCargo
     * 
     * @param  String cargo El cargo que ocupa el directivo
     */
    public void setCargo(String cargo)
    {
        Cargos cargos = new Cargos();
        if (cargos.esCargoValido(cargo)) {
            this.cargo = cargo;
        }
    }
    
    /**
     * Método getCargo
     * 
     * @return  String  El cargo que ocupa el directivo
     */
    public String getCargo()
    {
        return cargo;
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
             + "\n  Cargo          :" + cargo;
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
        Cargos cargos = new Cargos();
        Double sueldoMensual = cargos.getSueldo(cargo);
        if (sueldoMensual != null) {
            this.setSueldoMensual(sueldoMensual);
        }
    }   
    
    @Override
    public String getInfoInicial() {
         return System.currentTimeMillis() + " || " + queSoy();
    }
    
    @Override
    public String getEventoLogable() {
         return super.logString() + " || " + cargo;
    }
}
