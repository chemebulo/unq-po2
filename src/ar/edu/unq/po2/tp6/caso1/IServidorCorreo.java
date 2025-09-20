package ar.edu.unq.po2.tp6.caso1;

import java.util.List;

public interface IServidorCorreo {
	public List<Correo> recibirNuevos(String nombreUsuario, String passUsuario);

	public void conectar(String nombreUsuario, String passUsuario);

	public void enviar(Correo correo);
}