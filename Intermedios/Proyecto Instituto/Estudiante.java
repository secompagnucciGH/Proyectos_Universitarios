
/**
 * Esta clase permitirá modelar un estudiante, utiliza
 * como superclase a la clase Persona
 * 
 @author Sebastian Compagnucci
 * @version (V1)
 */
public class Estudiante extends Persona
{
    // definición de variables de clase
    private static final String QUE_SOY = "Estudiante";
    // definición de variables de instancia
    private String carrera;
    private int cantMatAprob;
    private double importeCuota;
    
    /**
     * Constructor de objetos de la clase Estudiante
     */
    public Estudiante()
    {
        super();
    }

    /**
     * Constructor de objetos de la clase Estudiante
     *
     * @param  int dni El dni de la persona
     */
    public Estudiante(int dni)
    {
        super(dni);
    }

    /**
     * Método setCarrera
     * 
     * @param  String carrera La carrera que sigue el estudiante
     */
    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }

    /**
     * Método setCantidadMateriasAprobadas
     * 
     * @param  int cantMatAprob La cantidad de materias aprobadas
     *                          por el estudiante
     */
    public void setCantidadMateriasAprobadas(int cantMatAprob)
    {
        this.cantMatAprob = cantMatAprob;
    }

    /**
     * Método setImporteCuota
     * 
     * @param  double importeCuota El importe de la cuota que debe
     *                             abonar el estudiante
     */
    public void setImporteCuota(double importeCuota)
    {
        this.importeCuota = importeCuota;
    }

    
    /**
     * Método getCarrera
     * 
     * @return  String La carrera que sigue el estudiante
     */
    public String getCarrera()
    {
        return carrera;
    }

    /**
     * Método getCantidadMateriasAprobadas
     * 
     * @return  int  La cantidad de materias aprobadas
     *               por el estudiante
     */
    public int getCantidadMateriasAprobadas()
    {
        return cantMatAprob;
    }

    /**
     * Método getImporteCuota
     * 
     * @return  double El importe de la cuota que debe
     *                 abonar el estudiante
     */
    public double getImporteCuota()
    {
        return importeCuota;
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
             + "\n  Carrera        :" + carrera
             + "\n  Cant.Mat.Aprob.:" + cantMatAprob
             + "\n  Importe Cuota  :" + importeCuota;
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
