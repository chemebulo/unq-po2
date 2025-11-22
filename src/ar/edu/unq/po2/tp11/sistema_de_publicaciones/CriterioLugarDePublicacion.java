package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

public class CriterioLugarDePublicacion implements Criterio {
	private String lugarDePublicacion;
	
	public CriterioLugarDePublicacion(String lugarDePublicacion) {
		this.lugarDePublicacion = lugarDePublicacion;
	}
	
	@Override
	public boolean cumple(ArticuloAcademico articulo) {
		return articulo.getLugarDePublicacion().equals(lugarDePublicacion);
	}
}