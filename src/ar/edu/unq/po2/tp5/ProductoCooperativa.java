package ar.edu.unq.po2.tp5;

public class ProductoCooperativa implements Producto {
	private float precioBase;
	private int cantidadStock;
	
	public ProductoCooperativa(float precioBase, int cantidadStock) {
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
		return this.getPrecioBase() * this.descuento();
	}
	
	private float descuento() {
		return 0.9f;
	}
}