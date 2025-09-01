package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuadradoTestCase {
	private Cuadrado cuadrado;
	
	 @BeforeEach
	 public void setUp() throws Exception {
		 cuadrado = new Cuadrado(5);
	 }
	
	 /**
	  * Verifica el funcionamiento del cuadrado.
	  */
	 
	 @Test
	 public void testFuncionamientoCuadrado() {
		 assertEquals(cuadrado.getArea(), 25);
		 assertEquals(cuadrado.getPerimetro(), 20);
	 }
}