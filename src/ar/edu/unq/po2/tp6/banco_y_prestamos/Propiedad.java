package ar.edu.unq.po2.tp6.banco_y_prestamos;

public class Propiedad {
	private String direccion;
	private String descripcion;
	private float valorFiscal;
	
	public Propiedad(String direccion, String descripcion, float valorFiscal) {
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.valorFiscal = valorFiscal;
	}
	
	public String getDireccion() {
		return this.direccion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	
	public float getValorFiscal() {
		return this.valorFiscal;
	}
}