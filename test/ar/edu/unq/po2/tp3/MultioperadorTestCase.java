package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	private Multioperador multioperador;
	
	 @BeforeEach
	 public void setUp() throws Exception {
		 multioperador = new Multioperador();
		 
		 multioperador.añadirNumero(1);
		 multioperador.añadirNumero(3);
		 multioperador.añadirNumero(5);
		 multioperador.añadirNumero(7);
		 multioperador.añadirNumero(9);
		 multioperador.añadirNumero(1);
		 multioperador.añadirNumero(4);
		 multioperador.añadirNumero(24);
	 }
	
	 /**
	  * Verifica el funcionamiento del multioperador.
	  */
	 
	 @Test
	 public void testFuncionamientoMultioperador() {
		 assertEquals(multioperador.multiplicarNumeros(), 90720);
		 assertEquals(multioperador.sumarNumeros(), 54);
		 assertEquals(multioperador.restarNumeros(), (-52));
	 }
}
