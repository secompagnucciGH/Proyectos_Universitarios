package model;


/**
 1.4 Clase LibroFisico que hereda de Libro
 ● Atributos:
 ○ numeroPaginas (int)
 ● Métodos:
 ○ Constructor para inicializar titulo, autor, isbn y numeroPaginas.
 ○ Getter para numeroPaginas.
 ○ Implementación del método mostrarInfo que imprime la información del libro
 físico.
 */
public class LibroFisico extends Libro
{
    private int numeroPaginas;

    public LibroFisico(String titulo, String autor, String isbn, int numeroPaginas) {
        super(titulo, autor, isbn);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Titulo: " + getTitulo() + " Autor: " + getAutor() +  " ISBN: " + getIsbn() + " Numero de paginas: " + getNumeroPaginas() + " DISPONIBILIDAD: " + getDisponible());
    }

    @Override
    public String toString() {
        return super.toString() + "LibroFisico{" +
                "numeroPaginas=" + numeroPaginas +
                '}';
    }
}
