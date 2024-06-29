package model;

import java.util.ArrayList;

/**
1.2 Clase Usuario que hereda de Persona
● Atributos:
○ idUsuario (int)
○ librosPrestados (ArrayList<Libro>)
● Métodos:
○ Constructor para inicializar nombre, email e idUsuario.
○ Getters para idUsuario y librosPrestados.
○ Implementación del método mostrarInfo que imprime la información del
usuario.
○ Método prestarLibro(Libro libro) que añade un libro a
librosPrestados.
○ Método devolverLibro(Libro libro) que elimina un libro de
librosPrestados.
 */
public class Usuario extends Persona
{
    private  int idUsuario;
    private ArrayList<Libro> librosPrestados = new ArrayList<>();

    public Usuario(String nombre, String email, int idUsuario){
        super(nombre, email);

        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + super.getNombre() + getNombre() + " Email: " + super.getEmail() + " ID-USUARIO: " + getIdUsuario());
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }
}
