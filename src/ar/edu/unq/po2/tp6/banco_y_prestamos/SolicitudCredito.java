package ar.edu.unq.po2.tp6.banco_y_prestamos;

public abstract class SolicitudCredito {
	private Cliente cliente;
	private float montoSolicitado;
	private int plazoMeses;
	
	public SolicitudCredito(Cliente cliente, float montoSolicitado, int plazoMeses) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoMeses = plazoMeses;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public float getMontoSolicitado() {
		return this.montoSolicitado;
	}
	
	public int getPlazoMeses() {
		return this.plazoMeses;
	}
	
	public float montoCuotaMensual() {
		return this.montoSolicitado / this.plazoMeses;
	}
	
	public abstract boolean esAceptable();
}