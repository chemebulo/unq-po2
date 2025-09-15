package ar.edu.unq.po2.tp5.caja_mercado_central_v2;

public class ProductoEmpresa extends ProductoBase {
	
	public ProductoEmpresa(float precioBase, int cantidadStock) {
		super(precioBase, cantidadStock);
	}
	
	@Override
	public float montoTotal() {
		return this.getPrecioBase();
	}
}