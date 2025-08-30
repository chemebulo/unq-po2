package ar.edu.unq.po2.tp2;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.Map;
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
    
    @Test
    public void funcionamientoMensajesPrincipales() {
    	assertEquals(23, ricardo.edad());
    	assertEquals(758508f, ricardo.sueldoNeto(), 0.004f);
    	assertEquals(948160f, ricardo.sueldoBruto(), 0.004f);
    	
    	assertEquals(189652f, ricardo.retenciones(), 0.004f);
    	assertEquals(94816f, ricardo.retencionObraSocial(), 0.004f);
    	assertEquals(0f, ricardo.retencionExtraDeObraSocial(), 0.004f);
    	assertEquals(94836f, ricardo.retencionAportesJubilatorios(), 0.004f);
    }
    
    @Test
    public void imprimirDegloseConceptos() {
    	Map<String, Float> conceptos = ricardo.desgloceConceptos();
    	
    	for(Map.Entry<String, Float> entry : conceptos.entrySet()) {
    		System.out.println(entry.getKey() + " -> " + entry.getValue());
    	}
    }
}