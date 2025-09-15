package ar.edu.unq.po2.tp5;

public interface Producto extends Registrable {

	public float getPrecioBase();
	
	public boolean hayStock();
	
	public void decrementarStock();
}