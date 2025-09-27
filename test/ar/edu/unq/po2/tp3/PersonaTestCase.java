package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	private Persona jose;
	private Persona carlos;
	
	 @BeforeEach
	 public void setUp() throws Exception {
		 jose = new Persona("Jose", LocalDate.of(2004, 1, 22));
		 carlos = new Persona("Carlos", LocalDate.of(2000, 9, 11));
	 }
	
	 /**
	  * Verifica el funcionamiento de la persona.
	  */
	 
	 @Test
	 public void testFuncionamientoPersona() {
		 assertEquals(21, jose.getEdad());
		 assertEquals(25, carlos.getEdad());
		 assertTrue(jose.menorQue(carlos));
	 }
}
