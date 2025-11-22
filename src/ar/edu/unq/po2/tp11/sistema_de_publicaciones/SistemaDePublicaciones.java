package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePublicaciones extends Sistema {
	private List<ArticuloAcademico> publicaciones;
	
	public SistemaDePublicaciones() {
		this.publicaciones = new ArrayList<ArticuloAcademico>();
	}
	
	public void publicar(ArticuloAcademico articulo) {
		publicaciones.add(articulo);
		this.notificar(articulo);
	}
}