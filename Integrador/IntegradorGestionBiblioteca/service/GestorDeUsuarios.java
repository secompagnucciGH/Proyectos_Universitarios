package service;


import model.Usuario;

/**
2.1 Interfaz GestorDeUsuarios
● Métodos:
○ void agregarUsuario(Usuario usuario): Añade un usuario al sistema.
○ Usuario buscarUsuario(int idUsuario): Busca un usuario por su ID.
○ void eliminarUsuario(int idUsuario): Elimina un usuario del sistema
por su ID.
 */

public interface GestorDeUsuarios {
    void agregarUsuario(Usuario usuario);
    Usuario buscarUsuario(int idUsuario);
    void eliminarUsuario(int idUsuario);
}

