package ar.edu.unq.po2.tp2;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class EmpleadoPermanenteTest {
	private EmpleadoPermanente jorge;

    @BeforeEach
    public void setUp() {
        jorge = new EmpleadoPermanente("Jorge", "Av. La Plata 3981", "Casado", LocalDate.of(1979, 9, 22), 435000f, 2, 10);
    }
	
    @Test
    public void funcionamientoDeLosGetter() {
    	assertEquals("Jorge", jorge.getNombre());
    	assertEquals("Av. La Plata 3981", jorge.getDireccion());
    	assertEquals("Casado", jorge.getEstadoCivil());
    	assertTrue(jorge.getFechaDeNacimiento().isEqual(LocalDate.of(1979, 9, 22)));
    	assertEquals(435000f, jorge.getSueldoBasico(), 0.001f);
    	assertEquals(2, jorge.getCantidadHijos());
    	assertEquals(10, jorge.getAntiguedad());
    }
}
