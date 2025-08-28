package ar.edu.unq.po2.tp2;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class EmpleadoTemporarioTest {
    private EmpleadoTemporario ricardo;

    @BeforeEach
    public void setUp() {
        ricardo = new EmpleadoTemporario("Ricardo", "Edmundo Fierro 847", "Soltero", LocalDate.of(2002, 1, 22), 948000f, LocalDate.of(2025, 8, 31), 4);
    }
	
    @Test
    public void funcionamientoDeLosGetter() {
    	assertEquals("Ricardo", ricardo.getNombre());
    	assertEquals("Edmundo Fierro 847", ricardo.getDireccion());
    	assertEquals("Soltero", ricardo.getEstadoCivil());
    	assertTrue(ricardo.getFechaDeNacimiento().isEqual(LocalDate.of(2002, 1, 22)));
    	assertEquals(948000f, ricardo.getSueldoBasico(), 0.001f);
    	assertTrue(ricardo.getFechaFinDesignacion().isEqual(LocalDate.of(2025, 8, 31)));
    	assertEquals(4, ricardo.getCantidadHorasExtra());
    }
}