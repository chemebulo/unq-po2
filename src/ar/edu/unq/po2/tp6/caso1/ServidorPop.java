package ar.edu.unq.po2.tp6.caso1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServidorPop implements IServidorCorreo {
	private Map<String, String> usuarios;
	private Map<String, List<Correo>> correosPendientes;

	public ServidorPop() {
		this.usuarios = new HashMap<String, String>();
		this.correosPendientes = new HashMap<String, List<Correo>>();
	}
	
	@Override
	public List<Correo> recibirNuevos(String nombreUsuario, String passUsuario) {
		this.validarUsuario(nombreUsuario, passUsuario);
		List<Correo> nuevosCorreos = new ArrayList<Correo>(correosPendientes.get(nombreUsuario));
		correosPendientes.get(nombreUsuario).clear();
		return nuevosCorreos;
	}

	@Override
	public void conectar(String nombreUsuario, String passUsuario) {
		if(!this.estaConectado(nombreUsuario)) {
			usuarios.put(nombreUsuario, passUsuario);
			correosPendientes.put(nombreUsuario, new ArrayList<Correo>());
		}
	}

	@Override
	public void enviar(Correo correo) {
		String destinatario = correo.getDestinatario();
		validarConexion(destinatario);
		List<Correo> bandejaDestinatario = correosPendientes.get(destinatario);
		bandejaDestinatario.add(correo);
	}
	
	private void validarUsuario(String nombreUsuario, String passUsuario) {
		if(!this.esValidoUsuario(nombreUsuario, passUsuario)) {
			throw new RuntimeException("El usuario no existe o la contraseña es inválida.");
		}
	}
	
	private void validarConexion(String nombreUsuario) {
		if(!this.estaConectado(nombreUsuario)) {
			throw new RuntimeException("El usuario no existe.");
		}
	}
	
	private boolean esValidoUsuario(String nombreUsuario, String passUsuario) {
		return this.estaConectado(nombreUsuario) && this.laContraseñaEsCorrecta(nombreUsuario, passUsuario);
	} 
	
	private boolean estaConectado(String nombreUsuario) {
		return usuarios.containsKey(nombreUsuario);
	}
	
	private boolean laContraseñaEsCorrecta(String nombreUsuario, String passUsuario) {
		return usuarios.get(nombreUsuario) == passUsuario;
	}
}