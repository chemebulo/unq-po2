package ar.edu.unq.po2.tp5.caja_mercado_central_v2;

public class Impuesto extends FacturaBase {
	private float tasaDelServicio;
	
	public Impuesto(String periodo, float tasaDelServicio) {
		super(periodo);
		this.tasaDelServicio = tasaDelServicio;
	}
	
	@Override
	public float montoTotal() {
		return tasaDelServicio;
	}
}