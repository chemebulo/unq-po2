package ar.edu.unq.po2.tp9;

public class EstadoMVConUnaFicha extends EstadoMV {

	@Override
	public void iniciarJuego() {
		System.out.println("El juego se inició para un jugador.");
	}

	@Override
	public EstadoMV estadoAlIngresarFicha() {
		return new EstadoMVConDosFichas();
	}
}