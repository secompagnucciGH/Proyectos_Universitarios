/**
 * La clase Empleado deriva de Persona y permitirá
 * agrupar a todas las personas que cobran sueldo 
 * (administrativos, docentes, etc.).
 * Se declara como abstracta para que no se puedan
 * crear instancias, sino que solamente sirva como
 * superclase.
 * 
 * @author (Mario Finos) 
 * @version (V1)
 */
public abstract class Empleado extends Persona
{
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
     * Método calcularSueldo
     * Se declara como abstracto a fin de obligar
     * a todas las subclases a implementarlo
     * (sobreescribirlo)
     * 
     * @param  int mes El número de mes para el que se 
     *                 calcula el sueldo
     */
    public abstract void calcularSueldo(int mes);
      
    @Override
    public String logString() {
        return super.logString() + " || " + getSueldoMensual();
    }
     
    @Override
    public String getEventoLogable() {
        return super.logString() + " || " + getSueldoMensual();
    }
}