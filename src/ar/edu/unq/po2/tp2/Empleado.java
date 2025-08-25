package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private int sueldoBasico;
	
	public int edad() {
		return 0;
	}
	
	public float sueldoNeto() {
		return 0;
	}
	
	public abstract float retenciones();
	
	public abstract float retencionAportesJubilatorios();
	
	public abstract float retencionObraSocial();
	
	public abstract float sueldoBruto();
}