package ar.edu.unq.po2.tp2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoContratadoTest {
    private EmpleadoContratado juana;

    @BeforeEach
    public void setUp() {
    	juana = new EmpleadoContratado("Juana", "Garibaldi 910", "Soltero", LocalDate.of(1993, 4, 18), 999000f, 10, "Tarjeta");
    }
	
    @Test
    public void funcionamientoDeLosGetter() {
    	assertEquals("Juana", juana.getNombre());
    	assertEquals("Garibaldi 910", juana.getDireccion());
    	assertEquals("Soltero", juana.getEstadoCivil());
    	assertTrue(juana.getFechaDeNacimiento().isEqual(LocalDate.of(1993, 4, 18)));
    	assertEquals(999000f, juana.getSueldoBasico(), 0.001f);
    	assertEquals(10, juana.getNumeroDeContrato());
    	assertEquals("Tarjeta", juana.getMedioDePago());
    }
    
    @Test
    public void funcionamientoMensajesPrincipales() {
    	assertEquals(32, juana.edad());
    	assertEquals(998950f, juana.sueldoNeto(), 0.004f);
    	assertEquals(999000f, juana.sueldoBruto(), 0.004f);
    	
    	assertEquals(50f, juana.retenciones(), 0.004f);
    	assertEquals(50f, juana.gastosAdministrativosContractuales(), 0.004f);
    	assertEquals(0f, juana.retencionObraSocial(), 0.004f);
    	assertEquals(0f, juana.retencionExtraDeObraSocial(), 0.004f);
    	assertEquals(0f, juana.retencionAportesJubilatorios(), 0.004f);
    }
    
    @Test
    public void imprimirDegloseConceptos() {
    	Map<String, Float> conceptos = juana.desgloceConceptos();
    	
    	for(Map.Entry<String, Float> entry : conceptos.entrySet()) {
    		System.out.println(entry.getKey() + " -> " + entry.getValue());
    	}
    }
}