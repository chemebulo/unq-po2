package ar.edu.unq.po2.tp6.caso1;

public class Cliente {
	private String nombreUsuario;
	private String passUsuario;
	private GestorEmail gestorEmail;
	
	public Cliente(GestorEmail gestorEmail, String nombreUsuario, String passUsuario){
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = passUsuario;
		this.gestorEmail = gestorEmail;
		this.gestorEmail.conectar(nombreUsuario, passUsuario);
	}
	
	public int contarBorrados(){
		return this.gestorEmail.contarBorrados();
	}
	
	public int contarInbox(){
		return this.gestorEmail.contarInbox();
	}
	
	public void borrarCorreo(Correo correo){
		this.gestorEmail.borrarCorreo(correo);
	}
	
	public void eliminarBorrado(Correo correo){
		this.gestorEmail.eliminarBorrado(correo);
	}
	
	public void recibirNuevos(){
		this.gestorEmail.recibirNuevos(nombreUsuario, passUsuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		this.gestorEmail.enviarCorreo(asunto, destinatario, cuerpo);
	}
}