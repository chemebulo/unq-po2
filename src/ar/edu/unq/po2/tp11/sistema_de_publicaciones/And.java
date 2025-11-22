package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

public class And extends Conector {

	public And(Criterio criterioIzquierda, Criterio criterioDerecha) {
		super(criterioIzquierda, criterioDerecha);
	}
	
	@Override
	public boolean cumple(ArticuloAcademico articulo) {
		return this.getCriterioIzquierda().cumple(articulo) && this.getCriterioDerecha().cumple(articulo);
	}
}