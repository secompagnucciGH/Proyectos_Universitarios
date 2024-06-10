import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Esta clase permite definir un numero de 6 enteros y 2 decimales
 * con signo.
 * Valida que el valor a almacenar este entre los límites permitidos
 * para la variable en su parte entera. En su parte decimal realiza
 * redondeo a la centésima.
 * 
 * @author Sebastian Compagnucci
 * @version (V1)
 */
public class Numero6E2D
{   
    // define e inicializa la variable de clase para
    // almacenar el mayor valor permitido.
    public static final double TOPE_MAXIMO = 999999.99;
    // define e inicializa la variable de clase para
    // almacenar el menor valor permitido.
    public static final double TOPE_MINIMO = -999999.99;
    // define la variable de instancia para almacenar el número.
    private double numero;

    /**
     * Constructor de objetos (instancias) de la clase
     *       Numero6E2D
     */
    public Numero6E2D()
    {
        // inicializa la variable de instancia
        numero = 0;
    }

    /**
     * Método para asignar un valor a la variable de instancia
     * 
     * @param  numero      El valor que se desea guardar
     * 
     * @return  boolean -  El resultado de la asignación, retorna 
     *                     true si pudo guardar el valor, caso
     *                     contrario retorna false
     */
    public boolean setNumero(double numero)
    {   
        // Invoca al método que redondea el número recibido a 2 decimales
        numero = redondear2Dec(numero);
        // Evalúa el resultado de invocar al método que valida que el
        // número recibido no supere los topes
        if (validarNumero(numero)) {
            // Asigna el dato recibido como parámetro (redondeado) a la
            // variable de instancia
            this.numero = numero;
            return true;
        } else {
            return false;
        }    
    }

    /**
     * Método para recuperar el valor almacenado en la variable de instancia
     * 
     * @return  double  -  El valor almacenado en la variable de instancia 
     */
    public double getNumero()
    {   
        // Retorna el valor almacenado 
        return numero;
    }

    /**
     * Método privado para validar que el número a almacenar no supere
     * los topes establecidos
     * 
     * @param  numero   -  El valor que se desea guardar
     * 
     * @return  boolean -  El resultado de la validación, retorna 
     *                     true si es válido, caso
     *                     contrario retorna false
     */
    private boolean validarNumero(double numero)
    {   
        if (numero >= TOPE_MINIMO && numero <= TOPE_MAXIMO) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método privado para redondear el número a almacenar a 2 decimales    
     * 
     * @param  numero  -   El valor que se desea redondear
     * 
     * @return  double -   El número redondeado a 2 decimales   
     */
    private double redondear2Dec(double numero)
    {   
        // utiliza dos clases del paquete "java.math" de la biblioteca
        // estandar de java, para las mismas se incluyeron los "import"
        double redondeado = new BigDecimal(numero)
                                .setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        return redondeado;
    }
}
