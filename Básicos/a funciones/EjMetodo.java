import java.util.Scanner;
import java.lang.Math;

/**
 * @author Sebastian
 * @version (27/09/23)
 */
public class EjMetodo {
    public EjMetodo() {

    }

    /**
     * Este metodo recibe un numero entero por teclado y lo retorna.
     */
    private int leerNumeroEntero() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

    /**
     * Este metodo recibe como parametro dos catetos de un triangulo y retorna la
     * hipotenusa.
     */
    public double hipotenusa(double cateto1, double cateto2) {
        double resultado = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return resultado;
    }

    public double calculoDeuda(double capital, double razon, int mes) {
        double interesCapital = capital * razon * mes;
        double valor_deuda = capital + interesCapital;
        return valor_deuda;
    }

    private boolean esBisiesto(int a) {
        boolean bisiesto = false;
        if (a % 4 == 0) {
            bisiesto = true;
        }
        return bisiesto;
    }

    public int diasDelMes() {
        int mes = leerNumeroEntero();
        int año = leerNumeroEntero();
        int dias = 0;
        if (mes < 1 || mes > 12) {
            return -1;
        } else {
            switch (mes) {
                case 1:
                    dias = 31;
                    break;
                case 2:
                    if (esBisiesto(año)) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
                case 3:
                    dias = 31;
                    break;
                case 4:
                    dias = 30;
                    break;
                case 5:
                    dias = 31;
                    break;
                case 6:
                    dias = 30;
                    break;
                case 7:
                    dias = 31;
                    break;
                case 8:
                    dias = 31;
                    break;
                case 9:
                    dias = 30;
                    break;
                case 10:
                    dias = 31;
                    break;
                case 11:
                    dias = 30;
                    break;
                case 12:
                    dias = 31;
                    break;
            }
        }
        return dias;
    }

    private double circulo(double radio) {
        double area;
        area = Math.pow(radio, 2) * Math.PI;
        return area;
    }

    private double cuadrado(int lado) {
        int area;
        area = lado * lado;
        return area;
    }

    private double triangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public double superf_figura() {
        System.out.println("Ingresa el tipo de figura: ");
        System.out.println("1: Circulo. - 2: Cuadrado. - 3: Triangulo.");
        int figura = leerNumeroEntero();
        double area = 0;
        switch (figura) {
            case 1:
                System.out.println("Ingresa el radio del circulo: ");
                area = circulo(leerNumeroEntero());
                break;
            case 2:
                System.out.println("Ingrese la longitud de uno de los lados del cuadrado: ");
                area = cuadrado(leerNumeroEntero());
                break;
            case 3:
                System.out.println("Ingrese la medida base y altura del triangulo: ");
                area = triangulo(leerNumeroEntero(), leerNumeroEntero());
                break;
        }
        return area;
    }

    public boolean primos(int num) {
        // Si el número es menor o igual que 1, no es primo
        if (num <= 1) {
            return false;
        }
        // Si el número es divisible por 2, no es primo
        else if (num % 2 == 0) {
            return false;
        }
        // Si el número es divisible por cualquier número impar entre 3 y la raíz
        // cuadrada del número, no es primo
        else {
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        // Si el número no es divisible por ningún número entre 2 y su raíz cuadrada, es
        // primo
        return true;
    }

    public void cambio() {

        // * while tipo de operacion hasta que se ingrese el valor correcto */
        boolean tipoDeOperacion = false;
        boolean compra = false;
        boolean venta = false;

        while (!tipoDeOperacion) {
            System.out.println("Ingrese el tipo de operacion: (1- compra y 2-Venta)");

            int operacion = leerNumeroEntero();

            switch (operacion) {
                case 1:
                    compra = true;
                    System.out.println("---------------Seleccionó compra.---------------");
                    tipoDeOperacion = true;
                    break;
                case 2:
                    venta = true;
                    System.out.println("---------------Seleccionó Venta.---------------");
                    tipoDeOperacion = true;
                    break;
                default:
                    System.out.println("############## Error, (1- compra y 2-Venta) ##############");
            }
        }

        Scanner scanmoneda = new Scanner(System.in);

        boolean dolar = false;
        boolean euro = false;
        boolean tipoDeMoneda = false;
        String monedaTipo = null;

        // *do while hasta que se elija la correcta: */

        do {
            System.out.println("Seleccione el tipo de moneda  D para Dolares, E para euros.");
            String moneda = scanmoneda.nextLine();

            switch (moneda) {
                case "D":
                    dolar = true;
                    System.out.println("---------------Operación en Dólares---------------");
                    monedaTipo = "dolar"; // modena tipo
                    break;
                case "E":
                    euro = true;
                    System.out.println("---------------Operación en Euros---------------");
                    monedaTipo = "euro";
                    break;
                default:
                    System.out.println("############## Error D para Dolares, E para euros. ##############");
            }
        } while (!dolar && !euro);

        if (compra) {
            System.out.print("--------------- Seleccione la cantidad a coimprar: __ ---------------");
            double cantidad = leerNumeroEntero();
            Comprador(cantidad, monedaTipo);
        } else if (venta) {
            System.out.print("--------------- Seleccione la cantidad a vender: __ ---------------");
            double cantidad = leerNumeroEntero();
            Vendedor(cantidad, monedaTipo);
        }
    }

    // comprador
    // ------------------------------------------------------------------------------------------

    private void Comprador(double cantidad, String monedaTipo) {

        double val_compradol = (cantidad / 105 - ((cantidad * 0.30) - cantidad * 0.35));
        if (cantidad > 1) {
            if (monedaTipo.equals("dolar")) {
                System.out.print("Usted compró: " + val_compradol + " dólares.");
            }

            double val_compraeur = (cantidad / 120 - ((cantidad * 0.30) - cantidad * 0.35));

            if (monedaTipo.equals("euro")) {
                System.out.print("Usted compró: " + val_compraeur + " dólares.");
            }
        }
    }

    // vendedor
    // ------------------------------------------------------------------------------------------

    private void Vendedor(double cantidad, String monedaTipo) {

        double val_ventadol = (cantidad / 100);

        if (monedaTipo.equals("dolar")) {
            System.out.print("Usted vendió: " + val_ventadol + " dólares.");
        }

        double val_ventaeur = (cantidad / 110);

        if (monedaTipo.equals("euro")) {
            System.out.print("Usted vendió: " + val_ventaeur + " euros.");
        }
    }
}
