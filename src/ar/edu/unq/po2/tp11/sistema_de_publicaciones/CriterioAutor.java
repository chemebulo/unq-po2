package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

public class CriterioAutor implements Criterio {
	private String autor;
	
	public CriterioAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public boolean cumple(ArticuloAcademico articulo) {
		return articulo.existeAutor(autor);
	}
}