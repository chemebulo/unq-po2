package ar.edu.unq.po2.tp2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTest {
    private Empresa volkswagen;
    private EmpleadoPermanente jorge;
    private EmpleadoTemporario ricardo;
    private EmpleadoContratado juana;

    @BeforeEach
    public void setUp() {
    	volkswagen = new Empresa("Volkswagen", "20-99104531-7");
    	
    	jorge = new EmpleadoPermanente("Jorge", "Av. La Plata 3981", "Casado", LocalDate.of(1979, 9, 22), 435000f, 2, 10);
    	ricardo = new EmpleadoTemporario("Ricardo", "Edmundo Fierro 847", "Soltero", LocalDate.of(2002, 1, 22), 948000f, LocalDate.of(2025, 8, 31), 4);
    	juana = new EmpleadoContratado("Juana", "Garibaldi 910", "Soltero", LocalDate.of(1993, 4, 18), 999000f, 10, "Tarjeta");
    	
    	volkswagen.añadirEmpleado(jorge);
    	volkswagen.añadirEmpleado(ricardo);
    	volkswagen.añadirEmpleado(juana);
    	volkswagen.liquidarSueldos();
    }
	
    @Test
    public void funcionamientoDeLosGetter() {
    	assertEquals("Volkswagen", volkswagen.getNombre());
    	assertEquals("20-99104531-7", volkswagen.getCuit());
    	
    	assertEquals(2084343f, volkswagen.montoTotalSueldosNeto());
    	assertEquals(2383060f, volkswagen.montoTotalSueldosBruto());
    	assertEquals(298717f, volkswagen.montoTotalRetenciones());
    }
    
    @Test
    public void imprimirRecibos() {
    	List<ReciboDeHaberes> recibos = volkswagen.getRecibos();
    	
    	for (ReciboDeHaberes recibo : recibos) {
    	    recibo.imprimirRecibo();
    	}
    }
}