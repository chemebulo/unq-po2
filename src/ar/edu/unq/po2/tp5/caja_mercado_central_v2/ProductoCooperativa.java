package ar.edu.unq.po2.tp5.caja_mercado_central_v2;

public class ProductoCooperativa extends ProductoBase {
	
	public ProductoCooperativa(float precioBase, int cantidadStock) {
		super(precioBase, cantidadStock);
	}
	
	@Override
	public float montoTotal() {
		return this.getPrecioBase() * this.descuento();
	}
	
	private float descuento() {
		return 0.9f;
	}
}