package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReciboDeHaberesTest {
    private ReciboDeHaberes recibo;
    private EmpleadoTemporario ricardo;

    @BeforeEach
    public void setUp() {
    	ricardo = new EmpleadoTemporario("Ricardo", "Edmundo Fierro 847", "Soltero", LocalDate.of(2002, 1, 22), 948000f, LocalDate.of(2025, 8, 31), 4);
    	recibo = new ReciboDeHaberes("Ricardo", "Edmundo Fierro 847", LocalDate.now(), 0f, 0f, ricardo.desgloceConceptos());
    }
	
    @Test
    public void imprimirRecibo() {
    	recibo.imprimirRecibo();
    }
}