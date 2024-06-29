package service;


import model.Libro;

public interface GestorDeLibros
{
void agregarLibro(Libro libro);
Libro buscarLibro(String isbn);
void eliminarLibro(String isbn);
}
