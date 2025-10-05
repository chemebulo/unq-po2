package ar.edu.unq.po2.tp9.maquina_videojuegos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaVideojuegosTest {
	private MaquinaVideojuegos maquinaVideojuegos;
	
	@BeforeEach
	void setUp() {
		maquinaVideojuegos = new MaquinaVideojuegos();
	}
	
	@Test
	void testSeIntentaIniciarJuegoSinIngresarFichaYFalla() {
		assertThrows(RuntimeException.class, () -> maquinaVideojuegos.iniciarJuego());
	}
	
	@Test
	void testSeIntentaIniciarJuegoConUnaFichaYFunciona() {
		assertThrows(RuntimeException.class, () -> maquinaVideojuegos.iniciarJuego());
		maquinaVideojuegos.ingresarFicha();
		maquinaVideojuegos.iniciarJuego();
	}
	
	@Test
	void testSeIntentaIniciarJuegoConDosFichasYFunciona() {
		assertThrows(RuntimeException.class, () -> maquinaVideojuegos.iniciarJuego());
		maquinaVideojuegos.ingresarFicha();
		maquinaVideojuegos.ingresarFicha();
		maquinaVideojuegos.iniciarJuego();
	}
	
	@Test
	void testSeIntentaIniciarJuegoConDosFichasYFuncionaSeTerminaElJuegoYSiSeIntentaVolverAJugarFalla() {
		assertThrows(RuntimeException.class, () -> maquinaVideojuegos.iniciarJuego());
		maquinaVideojuegos.ingresarFicha();
		maquinaVideojuegos.iniciarJuego();
		maquinaVideojuegos.terminarJuego();
		assertThrows(RuntimeException.class, () -> maquinaVideojuegos.iniciarJuego());
	}
}