/**
 * La clase Empleado deriva de Persona y permitirá
 * agrupar a todas las personas que cobran sueldo 
 * (administrativos, docentes, etc.).
 * 
 * @author Sebastian Compagnucci
 * @version (V1)
 */
public class Empleado extends Persona
{
    // definición de variables de clase
    private static final String QUE_SOY = "Empleado";
    // definición de variables de instancia
    private double sueldoMensual;

    /**
     * Constructor de objetos de la clase Empleado
     */
    public Empleado()
    {
        super();
    }

    /**
     * Constructor de objetos de la clase Empleado
     *
     * @param  int dni El dni de la persona
     */
    public Empleado(int dni)
    {
        super(dni);
    }

    /**
     * Constructor de objetos de la clase Empleado
     *
     * @param  int  dni  El dni de la persona
     *         double sueldoMensual   El sueldo mensual del 
     *                                empleado
     */
    public Empleado(int dni, double sueldoMensual)
    {
        super(dni);
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Método setSueldoMensual
     * 
     * @param  double sueldoMensual El sueldo mensual del docente
     */
    public void setSueldoMensual(double sueldoMensual)
    {
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Método getSueldoMensual
     * 
     * @return  double  El sueldo mensual del docente
     */
    public double getSueldoMensual()
    {
        return sueldoMensual;
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
             + "\n  Sueldo Mensual :" + sueldoMensual;
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