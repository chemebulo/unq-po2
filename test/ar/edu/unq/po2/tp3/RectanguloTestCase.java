package ar.edu.unq.po2.tp3;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTestCase {
	private Rectangulo rectangulo;
	
	 @BeforeEach
	 public void setUp() throws Exception {
		 rectangulo = new Rectangulo(10, 5);
	 }
	
	 /**
	  * Verifica el funcionamiento del rectangulo.
	  */
	 
	 @Test
	 public void testFuncionamientoRectangulo() {
		 assertEquals(rectangulo.getArea(), 50);
		 assertEquals(rectangulo.getPerimetro(), 30);
		 assertFalse(rectangulo.esVertical());
		 assertTrue(rectangulo.esHorizontal());
	 }
}