package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Point sumPoint(int x, int y) {
		Point nuevo = new Point(this.x + x, this.y + y);
		return nuevo;
	}
}