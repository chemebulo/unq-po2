package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

public class CriterioTipoDeArticulo implements Criterio {
	private String tipoDeArticulo;
	
	public CriterioTipoDeArticulo(String tipoDeArticulo) {
		this.tipoDeArticulo = tipoDeArticulo;
	}
	
	@Override
	public boolean cumple(ArticuloAcademico articulo) {
		return articulo.getTipoDeArticulo() == tipoDeArticulo;
	}
}