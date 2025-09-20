package ar.edu.unq.po2.tp6.caso1;

public class GestorEmail {
	private IServidorCorreo servidor;
	private GestorEmailBorrado borrador;
	private GestorEmailEnvio inbox;
	
	public GestorEmail(IServidorCorreo servidor){
		this.servidor = servidor;
		this.borrador = new GestorEmailBorrado();
		this.inbox = new GestorEmailEnvio();
	}
	
	public Correo getPrimerInbox() {
		// Solo existe por los tests.
		return this.inbox.getFirst();
	}
	
	public void conectar(String nombreUsuario, String passUsuario){
		this.servidor.conectar(nombreUsuario, passUsuario);
	}
	
	public int contarBorrados(){
		return this.borrador.contarBorrados();
	}

	public int contarInbox(){
		return this.inbox.contarInbox();
	}

	public void borrarCorreo(Correo correo){
		this.inbox.borrarCorreo(correo);
		this.borrador.borrarCorreo(correo);
	}

	public void eliminarBorrado(Correo correo){
		this.borrador.eliminarBorrado(correo);
	}
	
	public void recibirNuevos(String nombreUsuario, String passUsuario){
		this.inbox.recibirNuevos(servidor, nombreUsuario, passUsuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}
}