package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class AutorTest {
	private Autor autor;
	
	@Test
	public void funcionamientoGeneral() {
		this.autor = new Autor("Carlos Rodriguez", "Universidad de Quilmes");
		assertEquals("Carlos Rodriguez", autor.getNombre());
		assertEquals("Universidad de Quilmes", autor.getFiliacion());
	}
}