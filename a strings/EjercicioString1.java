import java.util.Scanner;

/**
 * @author(Sebastian)
 *                    @v(1v)v
 */

public class EjercicioString1 {

    public void metodo1() {

        // LONGITUD CADENA
        String varString = ("En mi proxima vida, creeré en la reencarnacion");

        int longitud = varString.length();
        System.out.println(longitud);

        // INDEX 7
        // ----------------------------------------------------------------------------------------------------------
        char resultadoCharAt = varString.charAt(7);
        System.out.println(resultadoCharAt);

        // Índice de inicio (inclusive) y fin (exclusivo) de la SUBCADENA
        // ---------------------------------------------------------------------------------------------------------

        String subcadenaBuscada = "creeré";

        if (varString.toLowerCase().contains(subcadenaBuscada.toLowerCase())) {
            System.out.println("se encontro la subcadena: " + subcadenaBuscada);
        } else {
            System.out.println("La subcadena no se encontró en la cadena original.");
        }

        // El índice que ocupa el carácter 'x'
        // ---------------------------------------------------------------------------------------------------------
        System.out.println(
                "--------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese el caracter que quiere buscar: ");
        // Scanner sc = new Scanner(System.in).nextLine();
        Scanner sc = new Scanner(System.in);
        char caracterBuscado = sc.nextLine().charAt(0);
        boolean encontrado = false;

        for (int i = 0; i < longitud; i++) {
            if (caracterBuscado == varString.charAt(i)) {
                System.out.println("El caracter: " + caracterBuscado + " se encontró en el índice: " + i);
                encontrado = true;
            } else {
                if (i == (longitud - 1) && encontrado != true) {
                    System.out.println("No se encontró el caracter ingresado.");
                }
            }
        }

        // MAYUS
        // ---------------------------------------------------------------------------------------------------------
        String mayus = varString.toUpperCase();
        System.out.println(mayus);
        // START WHIT: E
        // ---------------------------------------------------------------------------------------------------------

        if (varString.startsWith("E", 1)) {
            System.out.println("la palabra empieza con e");
        } else {
            System.out.println("no comienza con e");
        }
    }

    public void metodo2() {
        String varString = ("Mañana es sabado y voy a irme a tomar unas copas por los barrios bajos de Logroño");

        int longitud = varString.length();

        for (int i = 0; i < longitud; i++) {
            char varStringChar = varString.charAt(i);
            if (varStringChar == 'a') {
                System.out.println("La letra 'a' se encontró en el índice: " + i);
            }
        }
    }

    // a, o y e 10 5 y 3
    // ---------------------------------------------------------------------------------------------------------

    public void metodo3() {
        String varString = "Mañana es sabado y voy a irme a tomar unas copas por los barrios bajos de Logroño";
        int longitud = varString.length();
        int contadorA = 0;
        int contadorO = 0;
        int contadorE = 0;

        for (int i = 0; i < longitud; i++) {
            char varStringChar = varString.charAt(i);

            if (varStringChar == 'a') {
                contadorA++;
            } else if (varStringChar == 'o') {
                contadorO++;
            } else if (varStringChar == 'e') {
                contadorE++;
            }
        }

        System.out.println("La letra 'a' aparece " + contadorA + " veces");
        System.out.println("La letra 'o' aparece " + contadorO + " veces");
        System.out.println("La letra 'e' aparece " + contadorE + " veces");

        if (contadorA > 10) {
            System.out.println("Exceso de letra a");
        }

        if (contadorO > 5) {
            System.out.println("Exceso de letra o");
        }

        if (contadorE > 3) {
            System.out.println("Exceso de letra e");
        }
    }

    // clave numerica
    // ---------------------------------------------------------------------------------------------------------

    public void metodo4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Ingrese una clave de 9 caracteres, con los primeros 8 siendo dígitos numéricos y el último una letra (mayúscula o minúscula):");
        String clave = scanner.nextLine();

        if (clave.length() == 9) {
            boolean esClaveValida = true;

            for (int i = 0; i < 8; i++) {
                if (!Character.isDigit(clave.charAt(i))) {
                    esClaveValida = false;
                    break;
                }
            }

            if (esClaveValida && Character.isLetter(clave.charAt(8))) {
                String parteNumerica = clave.substring(0, 8);
                System.out.println("Clave válida. Parte numérica: " + parteNumerica);
            } else {
                System.out.println("CLAVE no válida");
            }
        } else {
            System.out.println("CLAVE no válida");
        }
    }

    public void metodo5(String alfaString) {

        String clave = alfaString;
        int longitudClave = clave.length();
        int contadorDigito = 0;
        int contadorLetra = 0;
        boolean LetraMayus = false, LetraMinus = false;
        boolean caracterRepetido = false;
        // comprobacion largo

        if (longitudClave > 6) {

            // comparador caracteres iguales

            for (int i = 0; i < longitudClave; i++) {

                char comparadorCaracteres = clave.charAt(i);

                for (int k = i + 1; k < longitudClave; k++) {
                    if (comparadorCaracteres == clave.charAt(k)) {
                        caracterRepetido = true;
                        break;
                    }
                }

                // contador de digitos y letras

                if (Character.isDigit(clave.charAt(i))) {
                    contadorDigito++;
                } else if (Character.isLetter(clave.charAt(i))) {
                    contadorLetra++;
                    // comprobador de letra Mayus y Minus
                    if (Character.isUpperCase(clave.charAt(i))) {
                        LetraMayus = true;
                    } else if (Character.isLowerCase(clave.charAt(i))) {
                        LetraMinus = true;
                    }

                } else {
                    System.out.println("La clave solo recibe letras y números como válido.");
                    break;
                }
            }

            if (contadorDigito >= 3 && contadorLetra >= 4 && LetraMayus && LetraMinus && !caracterRepetido) {
                System.out.println("Contraseña correcta: " + clave);
            } else {
                if (caracterRepetido) {
                    System.out.println("Los caracteres no deben repetirse.");
                }
                if (contadorDigito < 3) {
                    System.out.println("La clave debe contener al menos 3 dígitos.");
                }
                if (contadorLetra < 4) {
                    System.out.println("La clave debe contener al menos 4 letras.");
                }
                if (!LetraMayus) {
                    System.out.println("La clave debe contener al menos una letra mayúscula.");
                }
                if (!LetraMinus) {
                    System.out.println("La clave debe contener al menos una letra minúscula.");
                }
            }

        } else {
            System.out.println("La clave debe tener más de 6 caracteres.");

        }
    }

    public static void llamarMetodo6() {
        metodo6("HIJ", "DEF", "ABC", "AIF");
    }

    private static void metodo6(String clave1, String clave2, String clave3, String claveFinal) {

        clave1 = clave1.toUpperCase();
        clave2 = clave2.toUpperCase();
        clave3 = clave3.toUpperCase();
        claveFinal = claveFinal.toUpperCase();

        int longitud1 = clave1.length();
        int longitud2 = clave2.length();
        int longitud3 = clave3.length();
        int longitudF = claveFinal.length();
        boolean clave1dig = soloLetras(clave1);
        boolean clave2dig = soloLetras(clave2);
        boolean clave3dig = soloLetras(clave3);
        boolean sinRepeticion = TieneRepeticion(clave1, clave2, clave3); // falso si tiene rep
        boolean contieneLasLetras = ContieneLasLetras(claveFinal, clave1, clave2, clave3); // falso si no contiene las
                                                                                           // letras

        if (longitud1 <= 3 && longitud2 <= 3 && longitud3 <= 3 && longitudF <= 3) {

            if (!clave1dig) {
                System.out.println("La primer clave no contiene solo letras! ," + clave1);
                return;
            }
            if (!clave2dig) {
                System.out.println("La segunda clave no contiene solo letras! ," + clave2);
                return;
            }
            if (!clave3dig) {
                System.out.println("La tercera clave no contiene solo letras! ," + clave3);
                return;
            }
            if (sinRepeticion && contieneLasLetras) {
                System.out.println(
                        "CLAVES EXITOSAS! Clave1: " + clave1 + " Clave2: " + clave2 + " Clave3: " + clave3
                                + "Clave Final: "
                                + claveFinal);
            }

        } else {
            System.out.println("Las contraseñas deben ser de 3 caracteres cada una");
            System.out.print(clave1 + " , " + clave2 + " , " + clave3);
        }
    }

    private static boolean soloLetras(String clave) {
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(clave.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean TieneRepeticion(String clave1, String clave2, String clave3) {
        for (int i = 0; i < 3; i++) {
            char letra = clave1.charAt(i);
            if (clave2.contains(String.valueOf(letra)) || clave3.contains(String.valueOf(letra))) {
                System.out.println("No se permiten repeticiones en las claves.");
                System.out.println(clave1 + " , " + clave2 + " , " + clave3);
                return false;
            }
        }
        for (int i = 0; i < 3; i++) {
            char letra = clave2.charAt(i);
            if (clave1.contains(String.valueOf(letra)) || clave3.contains(String.valueOf(letra))) {
                System.out.println("No se permiten repeticiones en las claves.");
                System.out.println(clave1 + " , " + clave2 + " , " + clave3);
                return false;
            }
        }
        for (int i = 0; i < 3; i++) {
            char letra = clave3.charAt(i);
            if (clave1.contains(String.valueOf(letra)) || clave2.contains(String.valueOf(letra))) {
                System.out.println("No se permiten repeticiones en las claves.");
                System.out.println(clave1 + " , " + clave2 + " , " + clave3);
                return false;
            }
        }
        return true;
    }

    private static boolean ContieneLasLetras(String clave, String clave1, String clave2, String clave3) {
        for (int i = 0; i < 3; i++) {

            char letra = clave.charAt(i);

            if (!clave1.contains(String.valueOf(letra)) && !clave2.contains(String.valueOf(letra))
                    && !clave3.contains(String.valueOf(letra))) {
                System.out.println("La clave final no contiene letras de claves anteriores!");
                return false;
            }
        }
        return true;
    }
}

//
// ---------------------------------------------------------------------------------------------------------
