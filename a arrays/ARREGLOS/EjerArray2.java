import java.util.Scanner;

public class EjerArray2 {

    static int[] numeros = new int[10];

    public EjerArray2() {
        Scanner sc = new Scanner(System.in);
        int i = 0; // Inicializa i

        do {
            int numero = sc.nextInt();
            numeros[i] = numero;
            i++; // Incrementa i
        } while (i < 10); // Corrige la condición del bucle
    }

    public int mayor() {
        int numeroMayor = numeros[0]; // Inicializa con el primer elemento

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }

        return numeroMayor;
    }
}
