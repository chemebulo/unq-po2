package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	 private Counter counter;
	 
	 /**
	  * Crea un escenario de test básico, que consiste en un contador con 10 enteros.
	  *
	  * @throws Exception
	  */
	 
	 @BeforeEach
	 public void setUp() throws Exception {
		 
		 //Se crea el contador.
		 counter = new Counter();
		 
		 //Se agregan los numeros. Un solo par y nueve impares.
		 counter.addNumero(1);
		 counter.addNumero(3);
		 counter.addNumero(5);
		 counter.addNumero(7);
		 counter.addNumero(9);
		 counter.addNumero(1);
		 counter.addNumero(1);
		 counter.addNumero(1);
		 counter.addNumero(1);
		 counter.addNumero(4);
	 }
	 
	 /**
	  * Verifica la cantidad de pares.
	  */
	 
	 @Test
	 public void testEvenNumbers() {
		 
		 // I check the amount is the expected one
		 assertEquals(counter.getCantidadDePares(), 1);
	 }
	 
	 /**
	  * Verifica la cantidad de impares.
	  */
	 
	 @Test
	 public void testOddNumbers() {
		 
		 // I check the amount is the expected one
		 assertEquals(counter.getCantidadDeImpares(), 9);
	 }
}