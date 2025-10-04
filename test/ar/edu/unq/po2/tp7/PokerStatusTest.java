package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	private PokerStatus pokerStatus;
	
	private Carta carta1;
	private Carta carta2;
	
	private Jugada jugada1;
	private Jugada jugada2;
	
	@BeforeEach
	void setUp() {
		//Test Double Installation
		pokerStatus = new PokerStatus();
		
		// Setup
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		
		jugada1 = mock(Jugada.class);
		jugada2 = mock(Jugada.class);
	}
	
	@Test
	void testJugada1LeGanaAJugada2() {
		// Test Double Configuration
		when(jugada1.leGanaAJugada(jugada2)).thenReturn(true);
		
		// Exercise & Verify
		assertEquals(jugada1, pokerStatus.verificar(jugada1, jugada2));
		verify(jugada1).leGanaAJugada(jugada2);
	}
	
	@Test
	void testJugada2LeGanaAJugada1() {
		// Test Double Configuration
		when(jugada1.leGanaAJugada(jugada2)).thenReturn(false);
		
		// Exercise & Verify
		assertEquals(jugada2, pokerStatus.verificar(jugada1, jugada2));
		verify(jugada1).leGanaAJugada(jugada2);
	}

	@Test
	void testPoquerLeGanaAColor() {
		// Setup
		Jugada poquer = new Jugada(TipoJugada.POQUER, ValorCarta.DOS);
        Jugada color = new Jugada(TipoJugada.COLOR, ValorCarta.A);
		
		// Exercise & Verify
		assertTrue(poquer.leGanaAJugada(color));
	}
	
    @Test
    public void testColorNoLeGanaAPoquer() {
    	// Setup
        Jugada color = new Jugada(TipoJugada.COLOR, ValorCarta.A);
        Jugada poquer = new Jugada(TipoJugada.POQUER, ValorCarta.DOS);
        
        // Exercise & Verify
        assertFalse(color.leGanaAJugada(poquer));
    }
    
    @Test
    public void testTrioLeGanaANada() {
    	// Setup
        Jugada trio = new Jugada(TipoJugada.TRIO, ValorCarta.Q);
        Jugada nada = new Jugada(TipoJugada.NADA, ValorCarta.A);
        
        // Exercise & Verify
        assertTrue(trio.leGanaAJugada(nada));
    }

    @Test
    public void testJugadaMismoTipoMayorValorGana() {
    	// Setup
        Jugada colorA = new Jugada(TipoJugada.COLOR, ValorCarta.K);
        Jugada colorB = new Jugada(TipoJugada.COLOR, ValorCarta.Q);
        
        // Exercise & Verify
        assertTrue(colorA.leGanaAJugada(colorB));
        assertFalse(colorB.leGanaAJugada(colorA));
    }

    @Test
    public void testJugadaMismoTipoMismoValorNoGana() {
    	// Setup
        Jugada colorA = new Jugada(TipoJugada.COLOR, ValorCarta.J);
        Jugada colorB = new Jugada(TipoJugada.COLOR, ValorCarta.J);
        
        // Exercise & Verify
        assertFalse(colorA.leGanaAJugada(colorB));
        assertFalse(colorB.leGanaAJugada(colorA));
    }
	
	@Test
	void testCartaConValorMayorAOtra() {
		// Test Double Configuration
        when(carta1.getValor()).thenReturn(13);
        when(carta1.getPalo()).thenReturn("D");
		
        when(carta2.getValor()).thenReturn(2);
        when(carta2.getPalo()).thenReturn("C");
        
		// Exercise & Verify
		pokerStatus.esValorDeMayorQue(carta1, carta2);
	}
	
	@Test
	void testCartaMismoPalo() {
		// Test Double Configuration
		when(carta1.getValor()).thenReturn(2);
		when(carta1.getPalo()).thenReturn("D");

		when(carta2.getValor()).thenReturn(3);
        when(carta2.getPalo()).thenReturn("D");

		// Exercise & Verify
		pokerStatus.esValorDeMayorQue(carta1, carta2);
	}
}