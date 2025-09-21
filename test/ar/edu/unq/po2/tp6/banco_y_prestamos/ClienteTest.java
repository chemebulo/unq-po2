package ar.edu.unq.po2.tp6.banco_y_prestamos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	private Cliente jose;
	private Cliente marcos;
	private Cliente juana;
	private Cliente carlos;

	@BeforeEach
	void setUp() {
		jose   = new Cliente("Jose", "Martinez", "Av. Las Heras 840", 40, 2500f, 50000f);
		marcos = new Cliente("Marcos", "Gimenez", "Garibaldi 904", 22, 1000f, 50000f);
		juana  = new Cliente("Juana", "Ferrari", "Av. de Mayo 639", 52, 3000f, 50000f);
		carlos = new Cliente("Carlos", "Rodriguez", "Juncal 1269", 71, 2000f, 50000f);
	}
	
	@Test
	void testClientes() {
		assertEquals(30000f, jose.sueldoNetoAnual());
		assertEquals(12000f, marcos.sueldoNetoAnual());
		assertEquals(36000f, juana.sueldoNetoAnual());
		assertEquals(24000f, carlos.sueldoNetoAnual());
		
		assertEquals(2500f, jose.getSueldoNetoMensual());
		assertEquals(1000f, marcos.getSueldoNetoMensual());
		assertEquals(3000f, juana.getSueldoNetoMensual());
		assertEquals(2000f, carlos.getSueldoNetoMensual());
		
		assertEquals(50000f, jose.getAhorros());
		assertEquals(50000f, marcos.getAhorros());
		assertEquals(50000f, juana.getAhorros());
		assertEquals(50000f, carlos.getAhorros());
		
		assertEquals(40, jose.getEdad());
		assertEquals(22, marcos.getEdad());
		assertEquals(52, juana.getEdad());
		assertEquals(71, carlos.getEdad());
		
		jose.ingresar(5000f);
		marcos.ingresar(200f);
		juana.ingresar(1500f);
		carlos.ingresar(777f);
		
		assertEquals(55000f, jose.getAhorros());
		assertEquals(50200f, marcos.getAhorros());
		assertEquals(51500f, juana.getAhorros());
		assertEquals(50777f, carlos.getAhorros());
	}
}