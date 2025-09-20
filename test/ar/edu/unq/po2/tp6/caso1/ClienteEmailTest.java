package ar.edu.unq.po2.tp6.caso1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteEmailTest {
	private Cliente juan;
	private Cliente jorge;
	private GestorEmail gmail;
	private GestorEmail yahoo;
	private ServidorPop google;
	
	@BeforeEach
	public void setUp() {
		google = new ServidorPop();
		gmail = new GestorEmail(google);
		yahoo = new GestorEmail(google);
		juan = new Cliente(gmail, "juanLopezH", "12345678");
		jorge = new Cliente(yahoo, "jorgeGonzalez55", "contraseña123");
	}
	
	@Test
	void testEnvioYRecepcionDeEmails() {
		assertEquals(0, juan.contarBorrados());
		assertEquals(0, juan.contarInbox());
		assertEquals(0, jorge.contarBorrados());
		assertEquals(0, jorge.contarInbox());
		
		juan.enviarCorreo("Bienvenido!", "jorgeGonzalez55", "Estoy probando el sistema de gestión de emails.");
		assertEquals(0, jorge.contarBorrados());
		assertEquals(0, jorge.contarInbox());
		
		jorge.recibirNuevos();
		assertEquals(0, jorge.contarBorrados());
		assertEquals(1, jorge.contarInbox());
		
		Correo correoJuan = yahoo.getPrimerInbox();
		jorge.borrarCorreo(correoJuan);
		assertEquals(1, jorge.contarBorrados());
		assertEquals(0, jorge.contarInbox());
		
		jorge.eliminarBorrado(correoJuan);
		assertEquals(0, jorge.contarBorrados());
		assertEquals(0, jorge.contarInbox());
		
		// ################################################################################################################################################### //
		
		jorge.enviarCorreo("RTA: Bievenido!", "juanLopezH", "Yo también, parece funcionar bien.");
		jorge.enviarCorreo("Coordinar Reunion", "juanLopezH", "Me gustaría coordinar una reunión de ser posible para este Sábado a las 17hs. Quedo a la espera.");
		assertEquals(0, juan.contarBorrados());
		assertEquals(0, juan.contarInbox());
		
		juan.recibirNuevos();
		assertEquals(0, juan.contarBorrados());
		assertEquals(2, juan.contarInbox());
		
		Correo correoJorge = gmail.getPrimerInbox();
		juan.borrarCorreo(correoJorge);
		assertEquals(1, juan.contarBorrados());
		assertEquals(1, juan.contarInbox());

		juan.eliminarBorrado(correoJorge);
		assertEquals(0, juan.contarBorrados());
		assertEquals(1, juan.contarInbox());
		
		correoJorge = gmail.getPrimerInbox();
		juan.borrarCorreo(correoJorge);
		assertEquals(1, juan.contarBorrados());
		assertEquals(0, juan.contarInbox());
		
		juan.eliminarBorrado(correoJorge);
		assertEquals(0, juan.contarBorrados());
		assertEquals(0, juan.contarInbox());
	}
}