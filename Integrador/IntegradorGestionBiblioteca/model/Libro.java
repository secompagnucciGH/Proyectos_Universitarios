package model;


/**
 1.3 Clase abstracta Libro
 ● Atributos:
 ○ titulo (String)
 ○ autor (String)
 ○ isbn (String)
 ○ disponible (boolean)
 ● Métodos:
 ○ Constructor para inicializar titulo, autor e isbn.
 ○ Getters para titulo, autor, isbn y disponible.
 ○ Setter para disponible.
 ○ Método abstracto mostrarInfo (sin implementación).

 */
public class Libro
{

    private String titulo;
    private String autor;
    private String isbn;
    private String disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDisponible() {
        return disponible;
    }

    public String getAutor() {
        return autor;
    }

    public void setDisponible(String disp) {
        this.disponible = disp;
    }

    public void mostrarInfo() {

    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", disponible='" + disponible + '\'' +
                '}';
    }
}
