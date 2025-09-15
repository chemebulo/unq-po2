package ar.edu.unq.po2.tp5.caja_mercado_central_v1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.caja_mercado_central_v1.Agencia;
import ar.edu.unq.po2.tp5.caja_mercado_central_v1.Arca;
import ar.edu.unq.po2.tp5.caja_mercado_central_v1.Caja;
import ar.edu.unq.po2.tp5.caja_mercado_central_v1.CajaMercadoCentral;
import ar.edu.unq.po2.tp5.caja_mercado_central_v1.Impuesto;
import ar.edu.unq.po2.tp5.caja_mercado_central_v1.ProductoCooperativa;
import ar.edu.unq.po2.tp5.caja_mercado_central_v1.ProductoEmpresa;
import ar.edu.unq.po2.tp5.caja_mercado_central_v1.Registrable;
import ar.edu.unq.po2.tp5.caja_mercado_central_v1.Servicio;

class CajaMercadoCentralTest {
	private Agencia arca;
	private Caja caja1;
	private Caja caja2;
	private Registrable arroz;
	private Registrable fideos;
	private Registrable polenta;
	private Registrable leche;
	private Registrable servicioEnero;
	private Registrable impuestoEnero;
	
	@BeforeEach
	public void setUp() {
		arca  = new Arca();
		caja1 = new CajaMercadoCentral(arca);
		caja2 = new CajaMercadoCentral(arca);
		arroz   = new ProductoCooperativa(500f, 5);
		polenta = new ProductoCooperativa(200f, 4);
		fideos  = new ProductoEmpresa(250f, 2);
		leche   = new ProductoEmpresa(300f, 10);
		servicioEnero = new Servicio("Enero", 10f, 20);
		impuestoEnero = new Impuesto("Enero", 30f);
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
		
		caja1.registrar(servicioEnero);
		caja2.registrar(impuestoEnero);
		
		assertEquals(2, arca.getPagosRegistrados().size());
	}
}