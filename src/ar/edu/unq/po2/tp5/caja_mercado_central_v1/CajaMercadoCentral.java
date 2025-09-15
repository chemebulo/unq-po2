package ar.edu.unq.po2.tp5.caja_mercado_central_v1;
import java.util.ArrayList;
import java.util.List;

public class CajaMercadoCentral implements Caja {
	private List<Producto> productos;
	private Agencia agencia;
	
	public CajaMercadoCentral(Agencia agencia) {
		this.productos = new ArrayList<Producto>();
		this.agencia = agencia;
	}
	
	@Override
	public void registrar(Registrable item) {
		if(item instanceof Producto) {
			this.registrarProducto((Producto) item);
		} 
		else if (item instanceof Factura) {
			this.registrarFactura((Factura) item);
		}
	}
	
	private void registrarProducto(Producto producto) {
		this.validarRegistro(producto);
		productos.add(producto);
		producto.decrementarStock();
	}
	
	private void registrarFactura(Factura factura) {
		agencia.registrarPago(factura);
	}
	
	private void validarRegistro(Producto producto) {
		if(!producto.hayStock()) {
			throw new IllegalArgumentException("No se puede registrar un producto que no se encuentra en stock.");
		}
	}
	
	@Override
	public float montoTotalAPagar() {
		return (float) productos.stream()
						        .mapToDouble(producto -> producto.montoTotal())
						        .sum();
	}
}