package ar.edu.unq.po2.tp6.banco_y_prestamos;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	private Propiedad garantia;
	
	public SolicitudCreditoHipotecario(Cliente cliente, float montoSolicitado, int plazoMeses, Propiedad garantia) {
		super(cliente, montoSolicitado, plazoMeses);
		this.garantia = garantia;
	}
	
	@Override
	public boolean esAceptable() {
		return this.clienteCumpleMontoCuota() && this.clienteCumpleMontoSolicitado() && this.clienteCumpleEdad();
	}
	
	private boolean clienteCumpleMontoCuota() {
		return this.montoCuotaMensual() <= (this.getCliente().getSueldoNetoMensual() * 0.5f);
	}
	
	private boolean clienteCumpleMontoSolicitado() {
		return this.getMontoSolicitado() <= (this.getGarantia().getValorFiscal() * 0.7f);
	}
	
	private boolean clienteCumpleEdad() {
		return (this.getCliente().getEdad() + this.plazoEnAños()) <= 65;
	}
	
	private int plazoEnAños() {
		return this.getPlazoMeses() / 12;
	}
	
	public Propiedad getGarantia() {
		return this.garantia;
	}
}