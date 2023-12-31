package com.cibertec.edu.services;

import java.util.List;

import com.cibertec.edu.entity.Usuario;

public interface UsuarioService {
	
	public Usuario registrar(Usuario usuario);
	public Usuario actualizar(Usuario usuario);
	public List<Usuario> listarTodos();
	public Usuario buscarPorID(Integer cod);
	public Usuario buscarUsuario(String correo, String clave);
	public Usuario buscarPorCorreo(String correo);

}
