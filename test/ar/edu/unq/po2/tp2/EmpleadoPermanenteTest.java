package ar.edu.unq.po2.tp2;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.Map;
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
    	assertEquals(435000f, jorge.getSueldoBasico(), 0.004f);
    	assertEquals(2, jorge.getCantidadHijos());
    	assertEquals(10, jorge.getAntiguedad());
    }
    
    @Test
    public void funcionamientoMensajesPrincipales() {
    	assertEquals(400f, jorge.salarioFamiliar(), 0.004f);

    	assertEquals(46, jorge.edad());
    	assertEquals(326885f, jorge.sueldoNeto(), 0.004f);
    	assertEquals(435900f, jorge.sueldoBruto(), 0.004f);
    	
    	assertEquals(109015f, jorge.retenciones(), 0.004f);
    	assertEquals(43630f, jorge.retencionObraSocial(), 0.004f);
    	assertEquals(40f, jorge.retencionExtraDeObraSocial(), 0.004f);
    	assertEquals(65385f, jorge.retencionAportesJubilatorios(), 0.004f);
    }
    
    @Test
    public void imprimirDegloseConceptos() {
    	Map<String, Float> conceptos = jorge.desgloceConceptos();
    	
    	for(Map.Entry<String, Float> entry : conceptos.entrySet()) {
    		System.out.println(entry.getKey() + " -> " + entry.getValue());
    	}
    }
}