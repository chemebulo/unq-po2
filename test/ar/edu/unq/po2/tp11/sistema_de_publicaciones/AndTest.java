package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AndTest {
	private Criterio criterioIzquierda;
	private Criterio criterioDerecha;
	private ArticuloAcademico articulo;
	private And and;
	
	@BeforeEach
	public void setUp() {
		this.criterioIzquierda = mock(Criterio.class);
		this.criterioDerecha = mock(Criterio.class);
		this.articulo = mock(ArticuloAcademico.class);
		this.and = new And(criterioIzquierda, criterioDerecha);
	}
	
	@Test
	public void funcionamientoGeneral() {
		assertFalse(and.cumple(articulo));
	}
}