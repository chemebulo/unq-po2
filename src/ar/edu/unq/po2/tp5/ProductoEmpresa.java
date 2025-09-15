package ar.edu.unq.po2.tp5;

public class ProductoEmpresa implements Producto {
	private float precioBase;
	private int cantidadStock;
	
	public ProductoEmpresa(float precioBase, int cantidadStock) {
		this.precioBase = precioBase;
		this.cantidadStock = cantidadStock;
	}
	
	public float getPrecioBase(){
		return precioBase;
	}
	
	public boolean hayStock(){
		return cantidadStock > 0;
	}
	
	public void decrementarStock(){
		cantidadStock--;
	}
	
	public boolean esDeCooperativa(){
		return false;
	}
}