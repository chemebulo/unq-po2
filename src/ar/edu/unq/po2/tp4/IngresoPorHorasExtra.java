package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtra extends Ingreso {
	private int cantidadaHorasExtra;
	
	public IngresoPorHorasExtra(String nombre, String concepto, double monto, int cantidadaHorasExtra) {
		super(nombre, concepto, monto);
		this.cantidadaHorasExtra = cantidadaHorasExtra;
	}
	
	public int getCantidadHorasExtra() {
		return cantidadaHorasExtra;
	}
	
	@Override
	public double montoImponible() {
		return 0;
	}
}