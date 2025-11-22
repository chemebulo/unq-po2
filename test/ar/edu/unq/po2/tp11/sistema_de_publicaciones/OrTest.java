package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrTest {
	private Criterio criterioIzquierda;
	private Criterio criterioDerecha;
	private ArticuloAcademico articulo;
	private Or or;
	
	@BeforeEach
	public void setUp() {
		this.criterioIzquierda = mock(Criterio.class);
		this.criterioDerecha = mock(Criterio.class);
		this.articulo = mock(ArticuloAcademico.class);
		this.or = new Or(criterioIzquierda, criterioDerecha);
	}
	
	@Test
	public void funcionamientoGeneral() {
		assertFalse(or.cumple(articulo));
	}
}