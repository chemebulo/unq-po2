package ar.edu.unq.po2.tp2;

public class EmpleadoPermanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad;
	
	public float sueldoFamiliar() {
		return 0;
	}
	
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