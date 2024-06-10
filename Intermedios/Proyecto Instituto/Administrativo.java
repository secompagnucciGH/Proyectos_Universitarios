
/**
 * Esta clase permitirá modelar un empleado 
 * administrativo, utiliza
 * como superclase a la clase Empleado.
 * 
 @author Sebastian Compagnucci
 * @version (V2)
 */
public class Administrativo extends Empleado
{
    // definición de variables de clase
    private static final String QUE_SOY = "Administrativo";
    // definición de variables de instancia
    private int horaEntrada;
    private int horaSalida;
    
    /**
     * Constructor de objetos de la clase Administrativo
     */
    public Administrativo()
    {
        super();
    }

    /**
     * Constructor de objetos de la clase Administrativo
     *
     * @param  int dni El dni de la persona
     */
    public Administrativo(int dni)
    {
        super(dni);
    }

    /**
     * Método setHoraEntrada
     * 
     * @param  int horaEntrada La hora de entrada del administrativo
     */
    public void setHoraEntrada(int horaEntrada)
    {
        this.horaEntrada = horaEntrada;
    }

    /**
     * Método setHoraSalida
     * 
     * @param  int horaSalida La hora de salida del administrativo
     */
    public void setHoraSalida(int horaSalida)
    {
        this.horaSalida = horaSalida;
    }

    
    /**
     * Método getHoraEntrada
     * 
     * @return  int  La hora de entrada del administrativo
     */
    public int getHoraEntrada()
    {
        return horaEntrada;
    }

    /**
     * Método getHoraSalida
     * 
     * @return  int  La hora de salida del administrativo
     */
    public int getHoraSalida()
    {
        return horaSalida;
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
             + "\n  Hora de Entrada:" + horaEntrada
             + "\n  Hora de Salida :" + horaSalida;
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