package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	private LocalDate fechaFinDesignacion;
	private int cantidadHorasExtra;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, int sueldoBasico, LocalDate fechaFinDesignacion, int cantidadHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	@Override
	public float retencionAportesJubilatorios() {
		return this.importePorcentualAportes() + this.importePorHoras();
	}
	
	private float importePorcentualAportes() {
		return this.sueldoBruto() * 0.10f;
	}
	
	private float importePorHoras() {
		return this.cantidadHorasExtra * 5f;
	}
	
	@Override
	public float retencionExtraDeObraSocial() {
		if(this.edad() > 50) {
			return 25f;
		} else {
			return 0f;
		}
	}

	@Override
	public float extraDependiendoCategoria() {
		return this.cantidadHorasExtra * 40f;
	}
}