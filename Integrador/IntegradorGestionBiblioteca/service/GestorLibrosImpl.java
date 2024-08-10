package service;


import model.Libro;

import java.util.HashMap;

public class GestorLibrosImpl implements GestorDeLibros {

    private HashMap<String,Libro> libros;

    public GestorLibrosImpl() {
        // Inicializamos el HashMap en el constructor
        this.libros = new HashMap<>();
    }
//    public GestorLibrosImpl() {
//        libros = new HashMap<>();
//    }

    @Override
    public void agregarLibro(Libro libro) {
        libros.put(libro.getIsbn(), libro);
    }

    @Override
    public Libro buscarLibro(String isbn) {
        System.out.println(libros.get(isbn));
        return libros.get(isbn);
    }

    @Override
    public void eliminarLibro(String isbn) {
        libros.remove(isbn);
    }

    @Override
    public String toString() {
        return
                "libro=" + libros +
                '}';
    }
}
