package ar.edu.unq.po2.tp5.personas_y_mascotas;
import java.time.LocalDate;
import java.time.Period;

public class Persona implements SerVivo {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int edad() {
		LocalDate hoy = LocalDate.now();
		return Period.between(fechaNacimiento, hoy).getYears();
	}
}