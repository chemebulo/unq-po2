package ar.edu.unq.po2.tp5.caja_mercado_central_v2;

public class CajaMercadoCentral implements Caja {
	private float montoTotal;
	private Agencia agenciaRecaudatoria;
	
	public CajaMercadoCentral(Agencia agenciaRecaudatoria) {
		this.montoTotal = 0;
		this.agenciaRecaudatoria = agenciaRecaudatoria;
	}
	
	@Override
	public void registrar(Registrable item) {
		item.registrarse(this);
	}
	
	@Override
	public void registrarProducto(Producto producto) {
		if(producto.hayStock()) {
			this.montoTotal += producto.montoTotal();
			producto.decrementarStock();
		}
	}
	
	@Override
	public void registrarFactura(Factura factura) {
		this.montoTotal += factura.montoTotal();
		agenciaRecaudatoria.registrarPago(factura);
	}

	@Override
	public float montoTotalAPagar() {
		return montoTotal;
	}
}