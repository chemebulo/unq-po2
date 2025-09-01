package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTestCase {
	private Point punto;
	
	 @BeforeEach
	 public void setUp() throws Exception {
		 punto = new Point();
		 punto.set(5, 3);
	 }
	
	 /**
	  * Verifica el funcionamiento del punto.
	  */
	 
	 @Test
	 public void testFuncionamientoMultioperador() {
		 assertEquals(punto.getX(), 5);
		 assertEquals(punto.getY(), 3);
		 
		 
		 Point nuevo = punto.sumPoint(3, 1);
		 
		 assertEquals(nuevo.getX(), 8);
		 assertEquals(nuevo.getY(), 4);
	 }
}