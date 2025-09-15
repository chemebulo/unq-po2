package ar.edu.unq.po2.tp5;

public class ProductoEmpresa implements Producto {
	private float precioBase;
	private int cantidadStock;
	
	public ProductoEmpresa(float precioBase, int cantidadStock) {
		this.precioBase = precioBase;
		this.cantidadStock = cantidadStock;
	}
	
	@Override
	public float getPrecioBase(){
		return precioBase;
	}
	
	@Override
	public boolean hayStock(){
		return cantidadStock > 0;
	}
	
	@Override
	public void decrementarStock(){
		cantidadStock--;
	}
	
	@Override
	public float montoTotal() {
		return this.getPrecioBase();
	}
}