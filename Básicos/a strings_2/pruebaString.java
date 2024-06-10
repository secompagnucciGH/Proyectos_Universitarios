
public class pruebaString
{
    public pruebaString() {
      // se añade una instancia "pruebav1"
    }

    public void metodoString(String String1) {
        int longitud = String1.length(); // Aquí se obtiene la longitud de la cadena String1
        System.out.println(longitud); // Luego, se imprime la longitud
    }

    public void stringprueba() {
        pruebaString pruebav1 = new pruebaString();
        String pruebav12 = "prueba"; // asignado "prueba" a pruebav1
        pruebav1.metodoString(pruebav12); // pruebav1 (instancia de pruebaString) llama a metodoString (contador) y se le pasa "pruebav12"
        // que es la cadena de texto.
        
    }
    
    public static void main(String[] args) {
        pruebaString prueba = new pruebaString();
        String miCadena = "cinco";
        prueba.metodoString(miCadena); // Llamamos al método y pasamos la cadena "Hola, mundo"
    }
}

