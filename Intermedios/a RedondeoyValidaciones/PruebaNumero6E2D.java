
/**
 * Esta clase se utiliza para probar algunos casos de la
 * clase Numero6E2D.
 * 
 * @author Sebastian Compagnucci
 * @version (V1-Refactorizada)
 */
public class PruebaNumero6E2D
{
    /**
     * Constructor de objetos de la clase PruebaNumero6E2D
     */
    public PruebaNumero6E2D()
    {
        procesar();
    }

    private void procesar()
    {
        // define e inicializa dos variables de tipo "Numero6E2D" 
        // invocando al constructor de la clase
        Numero6E2D n1 = new Numero6E2D();
        Numero6E2D n2 = new Numero6E2D();

        setearNumero(n1, 123456.789);
        imprimirValorAlmacenado(n1, "n1");
        imprimirSeparador();
        
        setearNumero(n2, 1234567.89);
        imprimirValorAlmacenado(n2, "n2");
        imprimirSeparador();
        
        setearNumero(n2, -0.789);
        imprimirValorAlmacenado(n2, "n2");
        imprimirSeparador();
        
        sumarDosNumeros(n1, n2);
        imprimirSeparador();
            
        setearNumero(n1, -999999.989);
        imprimirValorAlmacenado(n1, "n1");
        imprimirSeparador();

        sumarDosNumeros(n1, n2);
        imprimirSeparador();
        
        imprimirTopeMaximo();

        //desde aquí corresponde al ejercicio 4_17
        imprimirSeparador();

        // hasta aqui n1 y n2 apuntaban a dos objetos,
        // a partir de esta asignación apuntan al mismo
        n2 = n1;
        System.out.println("Asigno n1 a n2 igualándolas");
        imprimirValorAlmacenado(n2, "n2");
        imprimirSeparador();

        imprimirToString(n1, n2);
        imprimirSeparador();
        
        compararConEquals(n1, n2);
        
        compararConSignoIgual(n1, n2);
        imprimirSeparador();
    }

    private void setearNumero(Numero6E2D numero, double valor)
    {
        // invoca al método "setNumero" para asignarle un valor
        // y evalúa por true o false el retorno
        if (numero.setNumero(valor)) {
            System.out.println("Pudo asignar el valor " + valor);
        } else {
            System.out.println("No pudo asignar el valor " + valor);
        }
   
    }

    private void imprimirValorAlmacenado(Numero6E2D numero, 
                                         String nombreVariable)
    {
        // invoca al método "getNumero" para ver el valor almacenado
        System.out.println("Valor almacenado en " + nombreVariable + 
                           "....: " + numero.getNumero());
    }

    private void imprimirSeparador() 
    {
        System.out.println("-------------------------------------");
    }

    private void sumarDosNumeros(Numero6E2D n1, Numero6E2D n2)
    {
        Numero6E2D n3 = new Numero6E2D();
        // invoca al método "setNumero" de la variable n3, enviandole
        // la suma de los retornos del método "getNumero" de n1 y n2
        if (n3.setNumero(n1.getNumero() + n2.getNumero())) {
            System.out.println("Resultado de la suma....: " + n3.getNumero());
        } else {
            System.out.println("No pudo asignar el resultado de la suma");
        }
    }
    
    private void imprimirTopeMaximo() 
    {
        // utiliza la variable de clase "TOPE_MAXIMO" directamente desde
        // la clase porque es publica. Tambien podría utilizarse n1.TOPE_MAXIMO.
        // No es necesario crear instancias para usar estas variables.
        System.out.println("El tope máximo de la clase Numero6E2D es....: " 
                            + Numero6E2D.TOPE_MAXIMO);
    }
    
    private void imprimirToString(Numero6E2D n1, Numero6E2D n2) 
    {
        // imprime el resultado de invocar al método "toString"
        // de la clase Object
        System.out.println("toString de n1 retorna: " + n1);
        System.out.println("toString de n2 retorna: " + n2);
    }
    
    private void compararConEquals(Numero6E2D n1, Numero6E2D n2) 
    {
        // compara dos objetos utilizando el método "equals" de
        // la clase Object 
        if (n1.equals(n2)) {
            System.out.println("Comparadas con equals son iguales");
        } else {
            System.out.println("Comparadas con equals son distintos");
        }
    }
    
    private void compararConSignoIgual(Numero6E2D n1, Numero6E2D n2) 
    {
        // compara dos objetos utilizando el signo "=="
        // (forma tradicional de comparar dos variables)
        if (n1 == n2) {
            System.out.println("Comparadas con == son iguales");
        } else {
            System.out.println("Comparadas con == son distintos");
        }
    }
    
}
