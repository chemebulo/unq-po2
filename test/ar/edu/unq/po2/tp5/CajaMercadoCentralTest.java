package ar.edu.unq.po2.tp5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaMercadoCentralTest {
	private Caja caja1;
	private Caja caja2;
	private Producto arroz;
	private Producto fideos;
	private Producto polenta;
	private Producto leche;
	
	@BeforeEach
	public void setUp() {
		caja1 = new CajaMercadoCentral();
		caja2 = new CajaMercadoCentral();
		arroz   = new ProductoCooperativa(500f, 5);
		polenta = new ProductoCooperativa(200f, 4);
		fideos  = new ProductoEmpresa(250f, 2);
		leche   = new ProductoEmpresa(300f, 10);
	}
	
	@Test
	public void testFuncionamientoGeneral() {
		assertEquals(0, caja1.montoTotalAPagar());
		assertEquals(0, caja2.montoTotalAPagar());
		
		caja1.registrar(arroz);
		caja1.registrar(fideos);
		caja1.registrar(fideos);
		
		assertThrows(IllegalArgumentException.class, () -> caja1.registrar(fideos));
		assertEquals(950f, caja1.montoTotalAPagar());

		caja1.registrar(polenta);
		caja2.registrar(leche);
		caja2.registrar(leche);
		caja2.registrar(polenta);
		
		assertEquals(1130f, caja1.montoTotalAPagar());
		assertEquals(780f, caja2.montoTotalAPagar());
	}
}