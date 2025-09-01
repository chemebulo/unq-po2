package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	private Persona jose;
	private Persona carlos;
	private Persona ricardo;
	private Persona alberto;
	private Persona manuel;
	
	private EquipoDeTrabajo tpgrupal;
	
	 @BeforeEach
	 public void setUp() throws Exception {
		 jose = new Persona("Jose", LocalDate.of(2004, 1, 22));
		 carlos = new Persona("Carlos", LocalDate.of(2000, 9, 11));
		 ricardo = new Persona("Ricardo", LocalDate.of(1993, 2, 11));
		 alberto = new Persona("Alberto", LocalDate.of(1944, 9, 27));
		 manuel = new Persona("Manuel", LocalDate.of(1969, 5, 15));
		 
		 tpgrupal = new EquipoDeTrabajo("Fogata 2");
		 
		 tpgrupal.addIntegrante(jose);
		 tpgrupal.addIntegrante(carlos);
		 tpgrupal.addIntegrante(ricardo);
		 tpgrupal.addIntegrante(alberto);
		 tpgrupal.addIntegrante(manuel);
	 }
	 
	 /**
	  * Verifica el funcionamiento del Equipo de Trabajo.
	  */
	 
	 @Test
	 public void testFuncionamientoEquipoDeTrabajo() {
		 assertEquals(21, jose.getEdad());
		 assertEquals(24, carlos.getEdad());
		 assertEquals(32, ricardo.getEdad());
		 assertEquals(80, alberto.getEdad());
		 assertEquals(56, manuel.getEdad());
		 assertTrue(jose.menorQue(carlos));
		 
		 assertEquals("Fogata 2", tpgrupal.getNombre());
		 assertEquals(42, tpgrupal.getPromedioEdadIntegrantes());
	 }
}