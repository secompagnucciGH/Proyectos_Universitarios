// Definición de la clase Libro
public class Libro {
    // Atributos de la clase Libro
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor de la clase Libro
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // Método para obtener información del libro
    public void obtenerInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }



    public static void main(String[] args) {
        // Crear instancias de la clase Libro
        Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 1925);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        // Acceder a los métodos de las instancias
        libro1.obtenerInformacion();
        System.out.println("---------------");
        libro2.obtenerInformacion();
    }
}