package ar.edu.unq.po2.tp5.caja_mercado_central_v2;

public class Arca implements Agencia {
	private float montoPagosRegistrados;
	
	public Arca() {
		this.montoPagosRegistrados = 0;
	}
	
	@Override
	public void registrarPago(Factura factura) {
		this.montoPagosRegistrados += factura.montoTotal();
	}
	
	public float getMontoPagosRegistrados(){
		return montoPagosRegistrados;
	}
}