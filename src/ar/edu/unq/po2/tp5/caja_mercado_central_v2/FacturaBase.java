package ar.edu.unq.po2.tp5.caja_mercado_central_v2;

public abstract class FacturaBase implements Factura {
	private String periodo;
	
	public FacturaBase(String periodo) {
		this.periodo = periodo;
	}
	
	@Override
	public String getPeriodo() {
		return periodo;
	}
	
	@Override
	public void registrarse(Caja caja) {
		caja.registrarFactura(this);
	}
}
