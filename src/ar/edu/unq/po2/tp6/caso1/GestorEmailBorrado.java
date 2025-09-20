package ar.edu.unq.po2.tp6.caso1;
import java.util.ArrayList;
import java.util.List;

public class GestorEmailBorrado {
	private List<Correo> borrados;
	
	public GestorEmailBorrado() {
		this.borrados = new ArrayList<Correo>();
	}
	
	public void borrarCorreo(Correo correo) {
		this.borrados.add(correo);
	}
	
	public int contarBorrados() {
		return this.borrados.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
}