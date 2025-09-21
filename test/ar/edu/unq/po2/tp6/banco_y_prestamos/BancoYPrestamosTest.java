package ar.edu.unq.po2.tp6.banco_y_prestamos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoYPrestamosTest {
	private Banco macro;
	private Cliente jose;
	private Cliente marcos;
	private Cliente juana;
	private Cliente carlos;
	private SolicitudCredito solicitudJose;
	private SolicitudCredito solicitudMarcos;
	private SolicitudCredito solicitudJuana;
	private SolicitudCredito solicitudCarlos;
	private Propiedad departamentoHarbour;
	private Propiedad casaQuilmes;

	@BeforeEach
	void setUp() {
		macro  = new Banco();
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
	void testFuncionamientoBancoYPrestamos() {
		assertThrows(RuntimeException.class, () -> macro.registrarSolicitud(solicitudJose));
		assertThrows(RuntimeException.class, () -> macro.registrarSolicitud(solicitudMarcos));
		assertThrows(RuntimeException.class, () -> macro.registrarSolicitud(solicitudJuana));
		assertThrows(RuntimeException.class, () -> macro.registrarSolicitud(solicitudCarlos));
		
		macro.registrarCliente(jose);
		macro.registrarCliente(marcos);
		macro.registrarCliente(juana);
		macro.registrarCliente(carlos);
		
		macro.registrarSolicitud(solicitudJose);
		macro.registrarSolicitud(solicitudMarcos);
		macro.registrarSolicitud(solicitudJuana);
		macro.registrarSolicitud(solicitudCarlos);
		
		assertEquals(70000f, macro.montoTotalADesembolsar());
		
		assertTrue(solicitudJose.esAceptable());
		assertFalse(solicitudMarcos.esAceptable());
		assertTrue(solicitudJuana.esAceptable());
		assertFalse(solicitudCarlos.esAceptable());
		
		macro.otorgarSolicitudesAceptables();

		assertEquals(0, macro.montoTotalADesembolsar());
		
		assertEquals(70000f, jose.getAhorros());
		assertEquals(50000f, marcos.getAhorros());
		assertEquals(100000f, juana.getAhorros());
		assertEquals(50000f, carlos.getAhorros());
	}
}