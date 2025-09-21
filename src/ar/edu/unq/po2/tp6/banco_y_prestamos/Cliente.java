package ar.edu.unq.po2.tp6.banco_y_prestamos;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private float sueldoNetoMensual;
	private float ahorros;

	public Cliente(String nombre, String apellido, String direccion, int edad, float sueldoNetoMensual, float ahorros) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.ahorros = ahorros;
	}
	
	public float sueldoNetoAnual() {
		return this.sueldoNetoMensual * 12f;
	}
	
	public void ingresar(float cantidad) {
		this.ahorros += cantidad;
	}
	
	public float getAhorros() {
		return this.ahorros;
	}
	
	public float getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public int getEdad() {
		return this.edad;
	}
}