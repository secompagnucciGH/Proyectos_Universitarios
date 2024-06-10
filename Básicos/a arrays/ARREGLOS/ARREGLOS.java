import java.util.Scanner;

public class ARREGLOS {
    public void ejer1() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        int sumapositivos = 0;
        int sumanegativos = 0;
        double promedioNumerosNegativos = 0.0;
        double promedioNumerosPositivos = 0.0;
        double mediaArreglo = 0;
        int contadorPos = 0;
        int contadorNeg = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            mediaArreglo += array[i];

            if (array[i] > 0) {
                sumapositivos += array[i];
                contadorPos++;
            } else {
                sumanegativos += array[i];
                contadorNeg++;
            }
        }

        if (contadorNeg > 0) {
            promedioNumerosNegativos = (double) sumanegativos / contadorNeg;
        }

        if (contadorPos > 0) {
            promedioNumerosPositivos = (double) sumapositivos / contadorPos;
        }

        System.out.println("\nResultados:");

        System.out.println("Media del arreglo: " + (mediaArreglo / 10));
        System.out.println("Promedio de números negativos: " + promedioNumerosNegativos);
        System.out.println("Promedio de números positivos: " + promedioNumerosPositivos);
    }

    public void ejer2() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        int sumaPares = 0;
        int cantidadPares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();

            if (array[i] % 2 == 0) {
                sumaPares += array[i];
                cantidadPares++;
            }
        }

        if (cantidadPares > 0) {
            int mediaArregloPares = sumaPares / cantidadPares;
            System.out.println("La media del arreglo de valores pares es: " + mediaArregloPares);
        } else {
            System.out.println("No se ingresaron valores pares en el arreglo.");
        }
    }

    public void ejer3() {

        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;

        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        int contador = cantidadAlumnos;

        double[] array = new double[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {

            System.out.println("Ingrese la nota del alumno " + (i + 1));
            array[i] = scanner.nextInt();

            sumaNotas += array[i];

        }

        double promedioNotas = (sumaNotas / contador);

        System.out.println("Los alumnos con notas mayores al PROMEDIO: " + promedioNotas);

        for (int i = 0; i < contador; i++) {
            if (array[i] > promedioNotas) {
                System.out.println("El alumno número " + (i + 1) + " con la nota: " + array[i]);
            }
        }
    }

    public void ejer4() {
        int[] pares = new int[20];
        Scanner scanner = new Scanner(System.in);

        int contadorPares = 0;

        while (contadorPares < 20) {

            System.out.println("Ingrese el número par de la posición " + (contadorPares + 1));
            int numeroPar = scanner.nextInt();

            if (numeroPar % 2 == 0) {
                pares[contadorPares] = numeroPar;
                contadorPares++;

            } else {
                System.out.println("El número ingresado no es par, intente nuevamente.");
            }
        }

        System.out.println("Los 20 números pares ingresados son: ");

        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }
    }

}
