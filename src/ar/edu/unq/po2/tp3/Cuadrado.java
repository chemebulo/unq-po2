package ar.edu.unq.po2.tp3;

public class Cuadrado {
	private int tamaño;
	
	public Cuadrado(int x) {
		this.tamaño = x;
	}
	
	public int getArea() {
		return this.tamaño * this.tamaño;
	}
	
	public int getPerimetro() {
		return this.tamaño * 4;
	}
}