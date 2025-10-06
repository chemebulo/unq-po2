package ar.edu.unq.po2.tp8.cultivos;

public class ParcelaComun implements Parcela {
	private TipoCultivo tipoCultivo;

	public ParcelaComun(TipoCultivo tipoCultivo) {
		this.tipoCultivo = tipoCultivo;
	}

	@Override
	public int gananciaAnual() {
		return tipoCultivo.getGananciaAnual();
	}

	@Override
	public void añadirParcela(Parcela parcela) {
		throw new RuntimeException("No se puede añadir una parcela en una parcela común.");
	}

	@Override
	public void eliminarParcela(Parcela parcela) {
		throw new RuntimeException("No se puede eliminar una parcela en una parcela común.");
	}

	@Override
	public int gananciaTrigo() {
		return tipoCultivo == TipoCultivo.TRIGO ? tipoCultivo.getGananciaAnual() : 0;
	}

	@Override
	public int gananciaSoja() {
		return tipoCultivo == TipoCultivo.SOJA ? tipoCultivo.getGananciaAnual() : 0;
	}
}