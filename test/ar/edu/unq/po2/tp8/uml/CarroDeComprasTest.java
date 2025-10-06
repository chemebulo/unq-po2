package ar.edu.unq.po2.tp8.uml;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroDeComprasTest {
	private CarroDeCompras carroDeCompras;
	private Product arroz;
	private Product fideos;
	private Product lavandina;
	
	@BeforeEach
	void setUp() {
		carroDeCompras = new CarroDeCompras();
		
		arroz = new Product(100, "Arroz");
		fideos = new Product(200, "Fideos");
		lavandina = new SpecialProduct(250.99f, "Lavandina");
		
	}
	
	@Test
	void testFuncionamientoCarritoDeCompras() {
		assertEquals(0, carroDeCompras.totalRounded());
		assertEquals(0, carroDeCompras.total());
		
		List<Product> productos = new ArrayList<Product>();
		productos.add(arroz);
		productos.add(fideos);
		productos.add(lavandina);
		
		carroDeCompras.setElements(productos);
		
		assertEquals(550, carroDeCompras.totalRounded());
		assertEquals(550.99f, carroDeCompras.total());
	}
}