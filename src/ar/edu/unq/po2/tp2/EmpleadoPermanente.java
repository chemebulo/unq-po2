package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.Map;

public class EmpleadoPermanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, float sueldoBasico, int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad = antiguedad;
	}
	
	public float salarioFamiliar() {
		return this.importePorHijos() + this.importePorEstadoCivil();
	}
	
	private float importePorHijos() {
		return this.cantidadHijos * 150f;
	}
	
	private float importePorEstadoCivil() {
		if("Casado".equalsIgnoreCase(this.getEstadoCivil())) {
			return 150f;
		} else {
			return 0f;
		}
	}
	
	private float importePorAntiguedad() {
		return this.antiguedad * 50f;
	}

	@Override
	public Map<String, Float> desgloceConceptos(){
		Map<String, Float> conceptos = super.desgloceConceptos();
		
		conceptos.put("Sueldo Salario Familiar", this.salarioFamiliar());
		conceptos.put("Sueldo Antiguedad",       this.importePorAntiguedad());
		
		return conceptos;
	}
	
	@Override
	public float sueldoBruto() {
		return super.sueldoBruto() + this.salarioFamiliar() + this.importePorAntiguedad();
	}
	
	@Override
	public float retencionAportesJubilatorios() {
		return this.sueldoBruto() * 0.15f;
	}

	@Override
	public float retencionExtraDeObraSocial() {
		return this.cantidadHijos * 20f;
	}
}