package ar.edu.unq.po2.tp8.cultivos;

public class Region {
	private Parcela parcela;
	
	public Region(Parcela parcela) {
		this.parcela = parcela;
	}
	
	public int gananciaAnual() {
		return parcela.gananciaAnual();
	}
	
	public int gananciaTrigo() {
		return parcela.gananciaTrigo();
	}

	public int gananciaSoja() {
		return parcela.gananciaSoja();
	}
}