package ar.edu.unq.po2.tp6.caso1;

import java.util.ArrayList;
import java.util.List;

public class GestorEmailEnvio {
	private List<Correo> inbox;
	
	public GestorEmailEnvio() {
		this.inbox = new ArrayList<Correo>();
	}
	
	public Correo getFirst() {
		// Solo existe por los tests.
		return inbox.get(0);
	}

	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
	}

	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void recibirNuevos(IServidorCorreo servidor, String nombreUsuario, String passUsuario){
		List<Correo> nuevosCorreos = servidor.recibirNuevos(nombreUsuario, passUsuario);
		this.inbox.addAll(nuevosCorreos);
	}
}