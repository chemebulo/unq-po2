package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

public class CriterioPalabraClave implements Criterio {
	private String palabraClave;
	
	public CriterioPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	
	@Override
	public boolean cumple(ArticuloAcademico articulo) {
		return articulo.getPalabrasClave().contains(palabraClave);
	}
}