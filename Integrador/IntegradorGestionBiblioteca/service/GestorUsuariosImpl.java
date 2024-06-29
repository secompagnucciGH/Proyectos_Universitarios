package service;

import model.Libro;
import model.Usuario;

import java.util.HashMap;

public class GestorUsuariosImpl implements GestorDeUsuarios
{
    private HashMap<Integer, Usuario> usuarioHashMap;

    public GestorUsuariosImpl() {
        usuarioHashMap = new HashMap<>();
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarioHashMap.put(usuario.getIdUsuario(), usuario);
    }

    @Override
    public Usuario buscarUsuario(int idUsuario) {
        System.out.println(usuarioHashMap.get(idUsuario));
        return usuarioHashMap.get(idUsuario);
    }

    @Override
    public void eliminarUsuario(int idUsuario) {
        usuarioHashMap.remove(idUsuario);
    }


}
