package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private float sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, float sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	protected String getEstadoCivil() {
		return estadoCivil;
	}
	
	public int edad() {
		LocalDate hoy = LocalDate.now();
		return Period.between(fechaDeNacimiento, hoy).getYears();
	}
	
	public Map<String, Float> desgloceConceptos(){
		Map<String, Float> conceptos = new LinkedHashMap<>();
		conceptos.put("Sueldo Bruto",                       this.sueldoBruto());
		
		conceptos.put("Sueldo Neto",                        this.sueldoNeto());
		conceptos.put("Sueldo Básico",                      this.sueldoBasico);
		conceptos.put("Sueldo Extra Dependiendo Categoria", this.extraDependiendoCategoria());
		
		conceptos.put("Retenciones",                        this.retenciones());
		conceptos.put("Retención Obra Social",              this.retencionObraSocial());
		conceptos.put("Aportes Jubilatorios",               this.retencionAportesJubilatorios());
		
		return conceptos;
	}
	
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public float sueldoBruto() {
		return this.sueldoBasico + this.extraDependiendoCategoria();
	}
	
	public float retenciones() {
		return this.retencionObraSocial() + this.retencionAportesJubilatorios();
	}
	
	public float retencionObraSocial() {
		return this.retencionPorcentualDeObraSocial() + this.retencionExtraDeObraSocial();
	}
	
	private float retencionPorcentualDeObraSocial() {
		return this.sueldoBruto() * 0.10f;
	}
	
	public float retencionAportesJubilatorios(){
		return 0;
	}
	
	public float retencionExtraDeObraSocial(){
		return 0;
	}
	
	public float extraDependiendoCategoria(){
		return 0;
	}
}