package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConectorTest {
	private Conector conector;
	private Criterio criterioDerecha;
	private Criterio criterioIzquierda;
	
	@BeforeEach
	public void setUp() {
		this.criterioIzquierda = mock(Criterio.class);
		this.criterioDerecha = mock(Criterio.class);
		this.conector = new And(criterioIzquierda, criterioDerecha);
	}
	
	@Test
	public void funcionamientoGeneral() {
		assertEquals(criterioIzquierda, conector.getCriterioIzquierda());
		assertEquals(criterioDerecha, conector.getCriterioDerecha());
	}
}