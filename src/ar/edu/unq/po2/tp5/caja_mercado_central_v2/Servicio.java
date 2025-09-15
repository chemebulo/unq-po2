package ar.edu.unq.po2.tp5.caja_mercado_central_v2;

public class Servicio extends FacturaBase {
	private float costoPorUnidad;
	private int unidadesConsumidas;
	
	public Servicio(String periodo, float costoPorUnidad, int unidadesConsumidas) {
		super(periodo);
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	@Override
	public float montoTotal() {
		return unidadesConsumidas * costoPorUnidad;
	}
}