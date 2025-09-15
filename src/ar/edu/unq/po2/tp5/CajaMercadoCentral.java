package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;

public class CajaMercadoCentral implements Caja {
	private List<Producto> productos;
	
	public CajaMercadoCentral() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void registrar(Producto producto) {
		this.validarRegistro(producto);
		productos.add(producto);
		producto.decrementarStock();
	}
	
	private void validarRegistro(Producto producto) {
		if(!producto.hayStock()) {
			throw new IllegalArgumentException("No se puede registrar un producto que no se encuentra en stock.");
		}
	}
	
	public float montoTotalAPagar() {
		return (float) productos.stream()
						        .mapToDouble(producto -> this.precioConDescuentoSiAplica(producto))
						        .sum();
	}
	
	private float precioConDescuentoSiAplica(Producto producto) {
		float precioActual = producto.getPrecioBase();
		
		if(this.aplicaParaElDescuento(producto)) {
			precioActual = this.precioConDescuento(precioActual);
		}
		
		return precioActual;
	}
	
	private boolean aplicaParaElDescuento(Producto producto) {
		return producto.esDeCooperativa();
	}
	
	private float precioConDescuento(float precio) {
		return precio * this.descuento();
	}
	
	private float descuento() {
		return 0.9f;
	}
}