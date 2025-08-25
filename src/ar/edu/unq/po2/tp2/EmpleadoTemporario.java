package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	private LocalDate fechaFinDesignacion;
	private int cantidadHorasExtra;
	
	@Override
	public float retenciones() {
		return 0;
	}

	@Override
	public float retencionAportesJubilatorios() {
		return 0;
	}

	@Override
	public float retencionObraSocial() {
		return 0;
	}

	@Override
	public float sueldoBruto() {
		return 0;
	}
}