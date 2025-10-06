package ar.edu.unq.po2.tp8.cultivos;

public interface Parcela {
	
	public int gananciaAnual();
	
	public void añadirParcela(Parcela parcela);
	
	public void eliminarParcela(Parcela parcela);
	
	public int gananciaTrigo();
	
	public int gananciaSoja();
}