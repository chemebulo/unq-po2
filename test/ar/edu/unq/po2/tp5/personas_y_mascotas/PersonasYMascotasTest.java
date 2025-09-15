package ar.edu.unq.po2.tp5.personas_y_mascotas;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PersonasYMascotasTest {
	private Persona jose;
	private Persona carlos;
	private Mascota nivi;
	private Mascota exodus;
	private List<SerVivo> coleccion;
	
	@BeforeEach
	public void setUp() {
		jose   = new Persona("Jose", LocalDate.of(2024, 1, 22));
		carlos = new Persona("Carlos", LocalDate.of(1993, 9, 5));
		nivi   = new Mascota("Nivi", "Pitbull");
		exodus = new Mascota("Exodus", "Border Collie");
		
		coleccion = new ArrayList<SerVivo>();
		
		coleccion.add(jose);
		coleccion.add(carlos);
		coleccion.add(nivi);
		coleccion.add(exodus);
	}

	@Test
	void testFuncionamientoGeneral() {
		assertEquals("Jose", jose.getNombre());
		assertEquals("Carlos", carlos.getNombre());
		assertEquals("Nivi", nivi.getNombre());
		assertEquals("Exodus", exodus.getNombre());
		
		for(SerVivo s : coleccion) {
			System.out.println(s.getNombre());
		}
	}
}