public class Libro
{
    private String titulo;
    private String autor;
    private double precio;
    
    /**
     * 

#sistema de una tienda de libros
Tienes una clase Libro que almacena información sobre los libros que se venden. 
Cada libro tiene un título, un autor y un precio.

atributos : titulo, autor y precio.
    **/
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

