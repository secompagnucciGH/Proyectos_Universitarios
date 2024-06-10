import java.util.Scanner;

public class Quini6 {
    static int[] numerosQuini = new int[6]; // Arreglo para almacenar los números ingresados en el constructor.

    public Quini6() {
        int i = 0; // Inicializamos un contador para rastrear cuántos números se han ingresado.
        Scanner sc = new Scanner(System.in);

        do {
            numerosQuini[i] = sc.nextInt(); // Le pedimos al usuario que ingrese un número y lo almacenamos en el
                                            // arreglo.
            if (numerosQuini[i] >= 0 && numerosQuini[i] <= 45) {
                i++; // Si el número está dentro del rango válido (0-45), incrementamos el contador.
            } else {
                System.out.println("El número ingresado debe estar comprendido entre el 0 y el 45.");
                // Si el número no está en el rango válido, mostramos un mensaje de error.
            }
        } while (i < 6); // Repetimos el proceso hasta que se ingresen 6 números válidos.
    }

    public boolean existeEnQuini6(int n) {
        // Verifica si un número dado (n) existe en la lista de números de Quini6.
        for (int i = 0; i < 6; i++) {
            if (n == numerosQuini[i]) {
                return true; // Si se encuentra una coincidencia, devuelve true.
            }
        }
        return false; // Si no se encuentra ninguna coincidencia, devuelve false.
    }

    public void verificaQuini6() {
        Scanner sc = new Scanner(System.in);
        int[] numeroVerificar = new int[6];
        int numeroVerificado = 0;
        int k = 0;

        do {
            System.out.print("Ingrese el número " + (k + 1) + ": ");
            int numero = sc.nextInt();
            if (numero >= 0 && numero <= 45) {
                numeroVerificar[k] = numero; // Se ingresan 6 números para verificar si coinciden con los números de
                                             // Quini6.
                if (existeEnQuini6(numeroVerificar[k])) {
                    numeroVerificado++; // Si hay una coincidencia, se incrementa el contador de coincidencias.
                }
                k++;
            } else {
                System.out.println("El número ingresado debe estar comprendido entre el 0 y el 45.");
            }
        } while (k < 6);

        if (numeroVerificado == 6) {
            System.out.println("Quini 6 Ganador !!!");
            // Si todas las coincidencias son 6, se muestra un mensaje de "Quini 6 Ganador".
        } else if (numeroVerificado > 0) {
            System.out.println("Se encontraron " + numeroVerificado + " coincidencias.");
            System.out.println("Se encontraron los números:");
            for (int i = 0; i < 6; i++) {
                if (existeEnQuini6(numeroVerificar[i])) {
                    System.out.println(numeroVerificar[i]);
                }
            }
            // Si se encontraron algunas coincidencias, se muestra la cantidad y los números
            // coincidentes.
        } else {
            System.out.println("No se encontraron coincidencias.");
            // Si no se encontraron coincidencias, se muestra un mensaje de "No se
            // encontraron coincidencias".
        }
    }

    public void comparaQuini() {
        Scanner sc = new Scanner(System.in);
        int[] apuesta = new int[6]; // Arreglo para almacenar la apuesta del usuario

        // A. Validar que cada número ingresado sea correcto (entre 0 y 45)
        for (int i = 0; i < 6; i++) {
            int numero;
            boolean repetido;

            do {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numero = sc.nextInt();
                repetido = false;

                if (numero < 0 || numero > 45) {
                    System.out.println("El número ingresado debe estar comprendido entre el 0 y el 45.");
                } else {
                    // Verificar si el número ya está en la apuesta
                    for (int j = 0; j < i; j++) {
                        if (apuesta[j] == numero) {
                            System.out.println("El número ya ha sido ingresado. Ingrese otro número.");
                            repetido = true;
                            break;
                        }
                    }
                }
            } while (numero < 0 || numero > 45 || repetido);

            apuesta[i] = numero;
        }

        // B. Verificar cuántos números coinciden con quini[6]
        int puntos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (apuesta[i] == numerosQuini[j]) {
                    puntos++;
                    break; // Salimos del bucle interno si encontramos una coincidencia
                }
            }
        }

        if (puntos == 6) {
            System.out.println("¡Quini 6 Ganador!");
        } else {
            System.out.println("Puntos obtenidos: " + puntos);
        }
    }
}
