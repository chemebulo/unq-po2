package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private double precio;
	private boolean precioCuidado;
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}
	
	public Producto(String nombre, double precio) {
		this(nombre, precio, false);
	}

	public double getPrecio() {
		return this.precio;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precio+=aumento;
	}

	public boolean esPrecioCuidado() {
		return this.precioCuidado;
	}
}