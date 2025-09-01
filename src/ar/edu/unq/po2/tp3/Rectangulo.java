package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private int base;
	private int altura;
	
	public Rectangulo(int x, int y) {
		if(x == y) {
			this.base = x + x;
			this.altura = y;
		} else {
			this.base = x;
			this.altura = y;
		}
	}
	
	public int getArea() {
		return this.base * this.altura;
	}
	
	public int getPerimetro() {
		return 2 * (base + altura);
	}
	
	public boolean esHorizontal() {
		return this.base > this.altura;
	}
	
	public boolean esVertical() {
		return this.altura > this.base;
	}
}