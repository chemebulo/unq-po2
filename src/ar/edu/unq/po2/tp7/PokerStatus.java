package ar.edu.unq.po2.tp7;

public class PokerStatus {

	public Jugada verificar(Jugada jugada1, Jugada jugada2) {
		return jugada1.leGanaAJugada(jugada2) ? jugada1 : jugada2;
	}
	
	public boolean esValorDeMayorQue(Carta carta1, Carta carta2) {
		return carta1.getValor() > carta1.getValor();
	}
	
	public boolean tienenElMismoPalo(Carta carta1, Carta carta2) {
		return carta1.getPalo() == carta2.getPalo();
	}
}