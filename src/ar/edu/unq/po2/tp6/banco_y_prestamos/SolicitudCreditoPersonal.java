package ar.edu.unq.po2.tp6.banco_y_prestamos;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente cliente, float montoSolicitado, int plazoMeses) {
		super(cliente, montoSolicitado, plazoMeses);
	}
	
	@Override
	public boolean esAceptable() {
		return this.clienteCumpleIngresoAnual() && this.clienteCumpleMontoCuota();
	}
	
	private boolean clienteCumpleIngresoAnual() {
		return this.getCliente().sueldoNetoAnual() >= 15000f;
	}
	
	private boolean clienteCumpleMontoCuota() {
		return this.montoCuotaMensual() <= (this.getCliente().getSueldoNetoMensual() * 0.7f);
	}
}