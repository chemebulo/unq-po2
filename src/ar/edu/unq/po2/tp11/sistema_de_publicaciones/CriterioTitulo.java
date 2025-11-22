package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

public class CriterioTitulo implements Criterio {
	private String titulo;
	
	public CriterioTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public boolean cumple(ArticuloAcademico articulo) {
		return articulo.getTitulo() == titulo;
	}
}