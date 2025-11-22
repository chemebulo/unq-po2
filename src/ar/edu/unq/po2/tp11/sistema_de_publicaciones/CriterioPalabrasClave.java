package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

public class CriterioPalabrasClave implements Criterio {
	private String palabrasClave;
	
	public CriterioPalabrasClave(String palabrasClave) {
		this.palabrasClave = palabrasClave;
	}
	
	@Override
	public boolean cumple(ArticuloAcademico articulo) {
		return articulo.getPalabrasClave().contains(palabrasClave);
	}
}