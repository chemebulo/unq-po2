package ar.edu.unq.po2.tp5;

public interface Producto {

	public float getPrecioBase();
	
	public boolean hayStock();
	
	public void decrementarStock();
	
	public boolean esDeCooperativa();
}