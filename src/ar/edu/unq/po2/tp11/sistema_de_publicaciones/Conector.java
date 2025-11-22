package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

public abstract class Conector implements Criterio {
	private Criterio criterioIzquierda;
	private Criterio criterioDerecha;
	
	public Conector(Criterio criterioIzquierda, Criterio criterioDerecha) {
		this.criterioIzquierda = criterioIzquierda;
		this.criterioDerecha = criterioDerecha;
	}
	
	public Criterio getCriterioIzquierda() {
		return criterioIzquierda;
	}
	
	public Criterio getCriterioDerecha() {
		return criterioDerecha;
	}
}