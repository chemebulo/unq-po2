package ar.edu.unq.po2.tp5.caja_mercado_central_v2;

public abstract class ProductoBase implements Producto {
	private float precioBase;
	private int cantidadStock;
	
	public ProductoBase(float precioBase, int cantidadStock) {
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
	public void registrarse(Caja caja){
		caja.registrarProducto(this);
	}
}