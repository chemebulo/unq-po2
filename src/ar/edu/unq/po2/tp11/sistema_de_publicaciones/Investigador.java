package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements Observer {
	private Criterio criterio;
	private List<ArticuloAcademico> articulosDeInteres;
	
	public Investigador(Criterio criterio) {
		this.criterio = criterio;
		this.articulosDeInteres = new ArrayList<ArticuloAcademico>();
	}
	
	@Override
	public void actualizar(ArticuloAcademico articulo) {
		if(criterio.cumple(articulo)) {
			articulosDeInteres.add(articulo);
		}
	}
	
	public List<ArticuloAcademico> articulosDeInteres(){
		return new ArrayList<ArticuloAcademico>(articulosDeInteres);
	}
}