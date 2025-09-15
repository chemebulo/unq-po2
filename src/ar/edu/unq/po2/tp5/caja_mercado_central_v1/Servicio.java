package ar.edu.unq.po2.tp5.caja_mercado_central_v1;

public class Servicio implements Factura {
	private String periodo;
	private float costoPorUnidad;
	private int unidadesConsumidas;
	
	public Servicio(String periodo, float costoPorUnidad, int unidadesConsumidas) {
		this.periodo = periodo;
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	@Override
	public String getPeriodo() {
		return periodo;
	}
	
	@Override
	public float montoTotal() {
		return unidadesConsumidas * costoPorUnidad;
	}
}