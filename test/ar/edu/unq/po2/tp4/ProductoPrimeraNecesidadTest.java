package ar.edu.unq.po2.tp4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoPrimeraNecesidadTest {
	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad fideos;
	
	@BeforeEach
	public void setUp() {
		leche  = new ProductoPrimeraNecesidad("Leche",  8d,  false, 10d);
		arroz  = new ProductoPrimeraNecesidad("Arroz",  4d,   true, 15d);
		fideos = new ProductoPrimeraNecesidad("Fideos", 10d, false, 50d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2d, leche.getPrecio());
		assertEquals(3.4d, arroz.getPrecio());
		assertEquals(5d, fideos.getPrecio());
	}
}