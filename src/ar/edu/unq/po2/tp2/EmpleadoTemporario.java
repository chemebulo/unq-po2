package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.Map;

public class EmpleadoTemporario extends Empleado {
	private LocalDate fechaFinDesignacion;
	private int cantidadHorasExtra;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, float sueldoBasico, LocalDate fechaFinDesignacion, int cantidadHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
	
	public LocalDate getfechaFinDesignacion() {
		return fechaFinDesignacion;
	}
	
	public int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}

	private float retencionPorcentualAportes() {
		return this.sueldoBruto() * 0.10f;
	}
	
	private float retencionPorHorasExtra() {
		return this.cantidadHorasExtra * 5f;
	}
	
	private float salarioPorHorasExtra() {
		return this.cantidadHorasExtra * 40f;
	}
	
	@Override
	public Map<String, Float> desgloceConceptos(){
		Map<String, Float> conceptos = super.desgloceConceptos();
		
		conceptos.put("Sueldo por Horas Extra", this.salarioPorHorasExtra());
		
		return conceptos;
	}
	
	@Override
	public float sueldoBruto() {
		return super.sueldoBruto() + this.salarioPorHorasExtra();
	}
	
	@Override
	public float retencionAportesJubilatorios() {
		return this.retencionPorcentualAportes() + this.retencionPorHorasExtra();
	}
	
	@Override
	public float retencionExtraDeObraSocial() {
		if(this.edad() > 50) {
			return 25f;
		} else {
			return 0f;
		}
	}
}