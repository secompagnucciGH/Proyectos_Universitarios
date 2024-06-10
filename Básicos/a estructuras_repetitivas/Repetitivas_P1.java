import java.util.Scanner;

public class Repetitivas_P1 {
    
    public void Ejercicio1(){
        Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[10];
        
        
            System.out.println("Ingrese 10 números:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

        int suma = 0;
        
                for (int num : numeros) {
                    suma += num;
                }

           
            System.out.println("La suma de los números es: " + suma);
   
    
    }
    
    
    
    public void Ejercicio2(){
        Scanner scanner = new Scanner(System.in);
        
        int suma = 0;
        int contadorNumero20 = 0;
        
        System.out.println("Ingrese una lista de números. Ingrese 0 para finalizar.");
        
        while (true) {
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            suma += numero;
            
            if (numero == 20) {
                contadorNumero20++;
            }
        }
        
        System.out.println("La suma de los números es: " + suma);
        
        if (suma > 100) {
            System.out.println("SUPERA LOS $100");
        }

        System.out.println("El número 20 fue ingresado " + contadorNumero20 + " veces.");
    }
    
    public void Ejercicio3(){
        int suma = 0;
        
        for(int i=0; i<100; i++){
        System.out.println(i);
        
        if (i>25){
        suma += i;
        
        }
        }
        
        System.out.println(suma - 99); 
    }
    
    public void Ejercicio4 (int NumA, int NumB){
        int suma = 0;
        
        while(suma<=10000)
        {
        suma += NumA + NumB;
        System.out.println(suma);
        }
    }
    
    public void Ejercicio5(){
        int num = 0;

        while ((num * num) < 5000) {
            System.out.println("Número: " + num + ", Cuadrado: " + (num * num));
            num++;
        }

    }
    
    public void Ejercicio6(){
        int num=0;
        int total=0;
        
        for (num = 1; num <= 100; num++) {
            
            total += num;
            
            System.out.println(total);
        }
    }
    
    public void Ejercicio6a() {
    
        int total = 0;
        int num = 1;
    
        do {
         total += num;
        num++;
       } while (num <= 100);
    
        System.out.println("La suma es: " + total);
    }
    
    public void Ejercicio6b() {
        int total = 0;
        int num = 1;
    
        while (num <= 100) {
        total += num;
        num++;
        }
    
        System.out.println("La suma es: " + total);
    }
    
    public void Ejercicio7() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
    
    public void Ejercicio8() 
    {
        
        Scanner scanner = new Scanner(System.in);
    
        int num;
        double promedio = 0;
        int contador = 0;
    
        System.out.println("Ingrese una lista de números a promediar, 0 para finalizar.");
    
        while (true) {
            num = scanner.nextInt();
        
            if (num == 0) {
                break;
            }
        
            promedio += num;
            contador++;
        }
    
            if (contador > 0) {
                    double resultadoPromedio = promedio / contador;
                    System.out.println("El promedio de la lista de números ingresados es: " + resultadoPromedio);
            } else {
                System.out.println("No se ingresaron números para calcular el promedio.");
            }
    }

    
    public void Ejercicio9() {
    
            int SumaNumeros = 0; 
    
            for (int i = 42; i <= 55; i++) {
                SumaNumeros += i;
            }
    
                System.out.println("El valor total de la suma es: " + SumaNumeros);
    }

    public void Ejercicio10() {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();

        if (numero < 1) {
                System.out.println("El número debe ser mayor que 1.");
            } else {
            for (int i = 1; i <= numero; i++) {
                    System.out.print(i + " ");
            }
        }
    }
    
    public void Ejercicio10a() {
                            Scanner scanner = new Scanner(System.in);
                int i;
                        System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

        if (numero <= 0) {
            for ( i = 1; i <= numero; i --){
                    System.out.print(i + " ");
            }
        } else {
            for (i = 1; i <= numero; i++) {
                    System.out.print(i + " ");
            }
        }
    }
    
    public void Ejercicio11(){

        int num = 3;
        int contador = 0;
        int Multi = 0;
    
    for ( int i = 1; i <= 100; i++) {

    Multi =+ num * i;
        System.out.print(Multi + " ; ");
    
         contador =+ i;
    } 

    System.out.println("La cantidad de multiplos es de: " + contador); 


    }
    
    
    public void Ejercicio12() {
            int sqrt;

        for (int i = 2; i <= 100; i += 2) {
            sqrt = (i * i);
                System.out.println("El cuadrado de " + i + " es: " + sqrt);
        }
    }
    
    
    public void Ejercicio13(){
            int[] AlumnosPorCurso = {0, 10, 15, 20, 25, 30};
            int alumnos;
            int alumnostotales;

            Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el número del curso (1-5, 0 para salir): ");
                int curso = scanner.nextInt();

            if (curso <= 0) {
                    break;
            } else if (curso >= 1 && curso <= 5) {
                    alumnos = AlumnosPorCurso[curso];
                    System.out.println("El curso " + curso + " tiene " + alumnos + " alumnos.");
            } else {
                    System.out.println("Curso inválido. Ingrese un valor entre 1 y 5.");
            }
        }
    }
    
    public void Ejercicio14() {
        int[] lista = new int[10];
        int SumaNumeros = 0;
        Scanner scanner = new Scanner(System.in);
    
        for (int i = 0; i < 10; i++) { 
            System.out.print("Ingrese un valor: ");
            lista[i] = scanner.nextInt();
        }

        for (int i = 1; i < 10; i++) { 
            if (lista[i] < lista[0]) {  
                SumaNumeros += lista[i]; 
            }
        }

        System.out.println("La suma de los valores menores que el primer valor es: " + SumaNumeros);
    }


    public void Ejercicio15() {
    
        Scanner scanner = new Scanner(System.in);
        int[] lista = new int[100];
        int contador = 0;

        System.out.println("Ingrese una lista de números (terminar con 0):");

        while (true) {
            int entrada = scanner.nextInt();

            if (entrada == 0) {
                break;
            }

            lista[contador] = entrada;
            contador++;
        }

        boolean listaOrdenada = true;

        for (int i = 1; i < contador; i++) {
            if (lista[i] < lista[i - 1]) {
                listaOrdenada = false;
                break;
            }
        }

        if (listaOrdenada) {
            System.out.println("La lista está ordenada.");
        } else {
            System.out.println("La lista NO está ordenada.");
        }
    
    }
     
    public void Ejercicio16() {
    
        Scanner scanner = new Scanner(System.in);
        int[] lista = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            lista[i] = scanner.nextInt();
        }

        int sumaPrimeros5 = 0;
        for (int i = 0; i < 5; i++) {
            sumaPrimeros5 += lista[i];
        }

        double promedioUltimos5 = 0;
        for (int i = 5; i < 10; i++) {
            promedioUltimos5 += lista[i];
        }
        promedioUltimos5 /= 5;

        System.out.println("La suma de los primeros 5 valores es: " + sumaPrimeros5);
        System.out.println("El promedio de los últimos 5 valores es: " + promedioUltimos5);
    }
    
    public void Ejercicio18() {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[10];
        int[] edades = new int[10];
        int indiceMayor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
            scanner.nextLine(); 
            
            if (edades[i] > edades[indiceMayor]) {
                indiceMayor = i;
            }
        }

        System.out.println("El alumno de mayor edad es: " + nombres[indiceMayor]);
    }



    public void Ejercicio19() {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer valor: ");
        int i = scanner.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        int NumB = scanner.nextInt();
        
        for (; i <= NumB; i++) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
        }
    
        
    }




}


