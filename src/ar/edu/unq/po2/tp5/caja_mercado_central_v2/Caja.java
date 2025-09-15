package ar.edu.unq.po2.tp5.caja_mercado_central_v2;

public interface Caja {

	public void registrar(Registrable item);
	
	public float montoTotalAPagar();
	
	public void registrarProducto(Producto producto);
	
	public void registrarFactura(Factura factura);
}