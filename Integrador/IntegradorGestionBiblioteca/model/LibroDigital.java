package model;


/**
 1.5 Clase LibroDigital que hereda de Libro
 ● Atributos:
 ○ tamanoArchivo (double)
 ● Métodos:
 ○ Constructor para inicializar titulo, autor, isbn y tamanoArchivo.
 ○ Getter para tamanoArchivo.
 ○ Implementación del método mostrarInfo que imprime la información del libro
 digital.

 */
public class LibroDigital extends Libro
{
    private double tamanoArchivo;

    public LibroDigital(String titulo, String autor, String isbn, double tamanoarchivo) {
        super(titulo, autor, isbn);
        this.tamanoArchivo = tamanoarchivo;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Titulo: " + getTitulo() + " Autor: " + getAutor() +  " ISBN: " + getIsbn() + " Tamaño del archivo: " + getTamanoArchivo() + " MB " + " DISPONIBILIDAD: " + getDisponible());
    }

    @Override
    public String toString() {
        return super.toString() + "LibroDigital{" +
                "tamanoArchivo=" + tamanoArchivo +
                '}';
    }
}
