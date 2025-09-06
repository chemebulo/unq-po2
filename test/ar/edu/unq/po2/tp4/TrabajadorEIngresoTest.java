package ar.edu.unq.po2.tp4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorEIngresoTest {
	private Trabajador juan;
	private Ingreso sueldoEnero;
	private Ingreso sueldoEneroExtra;
	private Ingreso sueldoFebrero;
	private Ingreso sueldoMarzo;

	@BeforeEach
	public void setUp() {
		juan = new Trabajador("Juan");
		sueldoEnero      = new Ingreso("Enero", "Sueldo", 1000d);
		sueldoEneroExtra = new IngresoPorHorasExtra("Enero", "Horas Extra", 100d, 20);
		sueldoFebrero    = new Ingreso("Febrero", "Sueldo", 1000d);
		sueldoMarzo      = new Ingreso("Febero", "Sueldo", 1000d);
	}
	
	@Test
	public void testTrabajadorEIngreso() {
		assertEquals(0, juan.getTotalPercibido());
		assertEquals(0, juan.getMontoImponible());
		assertEquals(0, juan.getImpuestosAPagar());
		
		juan.registrarIngreso(sueldoEnero);
		
		assertEquals(980d, juan.getTotalPercibido());
		assertEquals(1000d, juan.getMontoImponible());
		assertEquals(20d, juan.getImpuestosAPagar());
		
		juan.registrarIngreso(sueldoEneroExtra);
		juan.registrarIngreso(sueldoFebrero);
		juan.registrarIngreso(sueldoMarzo);
		
		assertEquals(3040d, juan.getTotalPercibido());
		assertEquals(3000d, juan.getMontoImponible());
		assertEquals(60d, juan.getImpuestosAPagar());
	}
}