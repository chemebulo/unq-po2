package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	 private Counter counter;
	 
	 /**
	  * Crea un escenario de test básico, que consiste en un contador con 10 enteros.
	  * @throws Exception
	  */
	 
	 @BeforeEach
	 public void setUp() throws Exception {
		 
		 //Se crea el contador.
		 counter = new Counter();
		 
		 //Se agregan los numeros. Un solo par y nueve impares.
		 counter.añadirNumero(1);
		 counter.añadirNumero(3);
		 counter.añadirNumero(5);
		 counter.añadirNumero(7);
		 counter.añadirNumero(9);
		 counter.añadirNumero(1);
		 counter.añadirNumero(1);
		 counter.añadirNumero(1);
		 counter.añadirNumero(1);
		 counter.añadirNumero(4);
		 counter.añadirNumero(24);
	 }
	 
	 /**
	  * Verifica la cantidad de pares.
	  */
	 
	 @Test
	 public void testNumerosPares() {
		 assertEquals(counter.getCantidadDePares(), 2);
	 }
	 
	 /**
	  * Verifica la cantidad de impares.
	  */
	 
	 @Test
	 public void testNumerosImpares() {
		 assertEquals(counter.getCantidadDeImpares(), 9);
	 }
	 
	 /**
	  * Verifica la cantidad de multiplos del cierto numero.
	  */
	 
	 @Test
	 public void testMultiplosDeUnNumero() {
		 assertEquals(counter.getCantidadDeMultiplosDe(3), 3);
	 }
	 
	 /**
	  * Verifica que devuelva el número con más numeros pares del arreglo.
	  */
	 
	 @Test
	 public void testNumeroConMasPares() {
		 assertEquals(counter.getNumeroConMasPares(), 24);
	 }
}