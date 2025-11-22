package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

public class Autor {
	private String nombre;
	private String filiacion;
	
	public Autor(String nombre, String filiacion) {
		this.nombre = nombre;
		this.filiacion = filiacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getFiliacion() {
		return filiacion;
	}
}