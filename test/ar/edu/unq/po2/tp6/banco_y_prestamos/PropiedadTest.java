package ar.edu.unq.po2.tp6.banco_y_prestamos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {
	private Propiedad departamentoHarbour;
	private Propiedad casaQuilmes;

	@BeforeEach
	void setUp() {
		departamentoHarbour = new Propiedad("Julieta Lanteri 1775", "Departamento de 250m2 con vista a la reserva ecológica", 250000f);
		casaQuilmes = new Propiedad("Edmundo Fierro 184", "Casa de 150m2 con un pequeño patio", 20000f);
	}

	@Test
	void testPropiedades() {
		assertEquals("Julieta Lanteri 1775", departamentoHarbour.getDireccion());
		assertEquals("Edmundo Fierro 184", casaQuilmes.getDireccion());
		
		assertEquals("Departamento de 250m2 con vista a la reserva ecológica", departamentoHarbour.getDescripcion());
		assertEquals("Casa de 150m2 con un pequeño patio", casaQuilmes.getDescripcion());

		assertEquals(250000f, departamentoHarbour.getValorFiscal());
		assertEquals(20000f, casaQuilmes.getValorFiscal());
	}
}