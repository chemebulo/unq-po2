package ar.edu.unq.po2.tp5.caja_mercado_central_v1;

public class Impuesto implements Factura {
	private String periodo;
	private float tasaDelServicio;
	
	public Impuesto(String periodo, float tasaDelServicio) {
		this.periodo = periodo;
		this.tasaDelServicio = tasaDelServicio;
	}
	
	@Override
	public String getPeriodo() {
		return periodo;
	}
	
	@Override
	public float montoTotal() {
		return tasaDelServicio;
	}
}