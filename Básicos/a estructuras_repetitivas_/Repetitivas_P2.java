/**
 * Repetitivas_P2
 *
 * @SebastianCompagnucci
 * @RepetitivasP2
 */

import java.util.Scanner;

public class Repetitivas_P2 {

  public void Ejercicio20() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Ingrese una letra (o 'X' para salir): ");
      char letra = scanner.nextLine().charAt(0);

      if (letra == 'A') {
        System.out.println("Se ingresó la letra 'A'");
      } else if (letra == 'X') {
        break; // Salir del bucle si se ingresa 'X'
      }
    }

    System.out.println("Finalizando el ingreso de letras.");
  }

  public void Ejercicio21() {
    Scanner scanner = new Scanner(System.in);

    boolean D = false;
    boolean O = false;
    boolean S = false;

    while (true) {
      System.out.print("Ingrese un carácter ('X' para salir): ");
      char inVar = scanner.next().charAt(0);

      switch (inVar) {
        case 'D':
          D = true;
          break;
        case 'O':
          O = true;
          break;
        case 'S':
          S = true;
          break;
        case 'X':
          if (D && O && S) {
            System.out.println("Se ingresaron las letras 'D', 'O' y 'S'");
          } else {
            System.out.println(
              "No se ingresaron las tres letras 'D', 'O' y 'S'"
            );
          }
          return;
      }
    }
  }

  public void Ejercicio22() {
    Scanner scanner = new Scanner(System.in);
    int factorial = 1;
    int inVar = scanner.nextInt();

    for (int i = 1; i <= inVar; i++) {
      factorial *= i;
      System.out.println(factorial);
    }
  }

  public void Ejercicio23() {
    Scanner scanner = new Scanner(System.in);
    int maxVal = Integer.MIN_VALUE; // Inicializa con el valor mínimo posible de int

    for (int i = 1; i <= 10; i++) {
      System.out.print("Ingrese un número: ");
      int inVar = scanner.nextInt();

      if (inVar > maxVal) {
        maxVal = inVar; // Actualiza maxVal si inVar es mayor
      }
    }

    System.out.println("El valor más alto ingresado es: " + maxVal);
  }

  public void Ejercicio24() {
    int resultado = 0;

    for (int i = 1; i <= 20; i++) {
      resultado = resultado + i;
      System.out.println(resultado - i + "+" + i + "=" + resultado);
    }
  }

  public void Ejercicio25() {
    Scanner scanner = new Scanner(System.in);
    int menor = 0;
    int mayor = 0;

    System.out.print("Ingrese el primer número: ");
    int inVar1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int inVar2 = scanner.nextInt();

    if (inVar1 >= inVar2) {
      mayor = inVar1;
      menor = inVar2;
    } else if (inVar2 >= inVar1) {
      mayor = inVar2;
      menor = inVar1;
    }

    for (int i = menor; i <= mayor; i++) {
      System.out.print(i);
    }
  }

  public void Ejercicio26() {
    Scanner scanner = new Scanner(System.in);

    int sumaNotas = 0;
    int cantidadAprobadas = 0;
    boolean todasAprobadas = true;

    int nota;

    while (true) {
      System.out.print(
        "Ingrese la nota del examen (0-10, o 99 para finalizar): "
      );
      nota = scanner.nextInt();

      if (nota == 99) {
        break;
      }

      if (nota >= 7) {
        cantidadAprobadas++;
      } else {
        todasAprobadas = false;
      }

      sumaNotas += nota;
    }

    if (cantidadAprobadas > 0) {
      double promedio = (double) sumaNotas / cantidadAprobadas;
      System.out.println("Promedio de notas: " + promedio);
    } else {
      System.out.println("No se ingresaron notas aprobadas.");
    }

    System.out.println("Cantidad de notas aprobadas: " + cantidadAprobadas);

    if (todasAprobadas) {
      System.out.println("HA APROBADO TODAS LAS MATERIAS.");
    }
  }

  public void Ejercicio27() {
    Scanner scanner = new Scanner(System.in);
    int cercano = 0; 
    int distanciaCercano = Integer.MAX_VALUE; 

    for (int i = 1; i <= 10; i++) { 
      System.out.print("Ingrese un número: ");
      int inVar = scanner.nextInt(); 

      int distanciaActual = Math.abs(inVar - 100); // Distancia al número 100.

      // Compara la distancia actual con la distancia al número más cercano encontrado hasta ahora.
      if (distanciaActual < distanciaCercano) {
        cercano = inVar;
        distanciaCercano = distanciaActual;
      }
    }

    System.out.println("El número más cercano a 100 es: " + cercano); 
}
}
