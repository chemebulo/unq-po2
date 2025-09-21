package ar.edu.unq.po2.tp6.banco_y_prestamos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudCreditoTest {
	private Cliente jose;
	private Cliente marcos;
	private Cliente juana;
	private Cliente carlos;
	private SolicitudCredito solicitudJose;
	private SolicitudCredito solicitudMarcos;
	private SolicitudCreditoHipotecario solicitudJuana;
	private SolicitudCreditoHipotecario solicitudCarlos;
	private Propiedad departamentoHarbour;
	private Propiedad casaQuilmes;

	@BeforeEach
	void setUp() {
		jose   = new Cliente("Jose", "Martinez", "Av. Las Heras 840", 40, 2500f, 50000f);
		marcos = new Cliente("Marcos", "Gimenez", "Garibaldi 904", 22, 1000f, 50000f);
		juana  = new Cliente("Juana", "Ferrari", "Av. de Mayo 639", 52, 4500f, 50000f);
		carlos = new Cliente("Carlos", "Rodriguez", "Juncal 1269", 71, 2000f, 50000f);
		departamentoHarbour = new Propiedad("Julieta Lanteri 1775", "Departamento de 250m2 con vista a la reserva ecológica", 250000f);
		casaQuilmes     = new Propiedad("Edmundo Fierro 184", "Casa de 150m2 con un pequeño patio", 20000f);
		solicitudJose   = new SolicitudCreditoPersonal(jose, 20000f, 24);
		solicitudMarcos = new SolicitudCreditoPersonal(marcos, 10000f, 12);
		solicitudJuana  = new SolicitudCreditoHipotecario(juana, 50000f, 24, departamentoHarbour);
		solicitudCarlos = new SolicitudCreditoHipotecario(carlos, 10000f, 36, casaQuilmes);
	}

	@Test
	void testSolicitudes() {
		assertEquals(jose, solicitudJose.getCliente());
		assertEquals(marcos, solicitudMarcos.getCliente());
		assertEquals(juana, solicitudJuana.getCliente());
		assertEquals(carlos, solicitudCarlos.getCliente());
		
		assertEquals(20000f, solicitudJose.getMontoSolicitado());
		assertEquals(10000f, solicitudMarcos.getMontoSolicitado());
		assertEquals(50000f, solicitudJuana.getMontoSolicitado());
		assertEquals(10000f, solicitudCarlos.getMontoSolicitado());
		
		assertEquals(24, solicitudJose.getPlazoMeses());
		assertEquals(12, solicitudMarcos.getPlazoMeses());
		assertEquals(24, solicitudJuana.getPlazoMeses());
		assertEquals(36, solicitudCarlos.getPlazoMeses());
		
		assertEquals(833.33f, solicitudJose.montoCuotaMensual(), 0.01f);
		assertEquals(833.33f, solicitudMarcos.montoCuotaMensual(), 0.01f);
		assertEquals(2083.33f, solicitudJuana.montoCuotaMensual(), 0.01f);
		assertEquals(277.77f, solicitudCarlos.montoCuotaMensual(), 0.01f);
		
		assertTrue(solicitudJose.esAceptable());
		assertFalse(solicitudMarcos.esAceptable());
		assertTrue(solicitudJuana.esAceptable());
		assertFalse(solicitudCarlos.esAceptable());
		
		assertEquals(departamentoHarbour, solicitudJuana.getGarantia());
		assertEquals(casaQuilmes, solicitudCarlos.getGarantia());
	}
}