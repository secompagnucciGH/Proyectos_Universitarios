package util;

import model.Libro;
import model.LibroFisico;
import model.Usuario;
import org.junit.jupiter.api.Test;
import service.GestorDeLibros;
import service.GestorDeUsuarios;
import service.GestorLibrosImpl;
import service.GestorUsuariosImpl;

import static org.junit.jupiter.api.Assertions.*;

public class Pruebas {
    @Test
    public void testAgregarYBuscarUsuario() {
        GestorDeUsuarios gestorUsuarios = new GestorUsuariosImpl();
        Usuario usuario = new Usuario("Juan Perez", "juan.perez@example.com", 1);
        gestorUsuarios.agregarUsuario(usuario);
        assertNotNull(gestorUsuarios.buscarUsuario(1));
    }
    
    @Test
    public void testAgregarYBuscarLibro() {
        GestorDeLibros gestorLibros = new GestorLibrosImpl();
        Libro libro = new LibroFisico("Cien Años de Soledad", "Gabriel Garcia Marquez", "12345", 417);
        gestorLibros.agregarLibro(libro);
        assertNotNull(gestorLibros.buscarLibro("12345"));
    }
    
    @Test
    public void testPrestarYDevolverLibro() {
        Usuario usuario = new Usuario("Maria Gomez", "maria.gomez@example.com", 2);
        Libro libro = new LibroFisico("1984", "George Orwell", "67890", 328);
        usuario.prestarLibro(libro);
        assertTrue(usuario.getLibrosPrestados().contains(libro));
        usuario.devolverLibro(libro);
        assertFalse(usuario.getLibrosPrestados().contains(libro));
    }
}
