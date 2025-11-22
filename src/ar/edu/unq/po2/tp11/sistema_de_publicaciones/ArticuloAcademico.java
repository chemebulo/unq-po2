package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import java.util.List;

public class ArticuloAcademico {
	private String titulo;
	private List<Autor> autores;
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private String palabrasClave;
	
	public ArticuloAcademico(String titulo, List<Autor> autores, String tipoDeArticulo, String lugarDePublicacion, String palabrasClave) {
		this.titulo = titulo;
		this.autores = autores;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.palabrasClave = palabrasClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public String getPalabrasClave() {
		return palabrasClave;
	}
	
	public boolean existeAutor(String nombreAutor) {
		return autores.stream()	
					  .anyMatch(a -> a.getNombre() == nombreAutor);
	}
}