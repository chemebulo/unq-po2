package ar.edu.unq.po2.tp9;

public class EstadoMVConDosFichas extends EstadoMV {

	@Override
	public void iniciarJuego() {
		System.out.println("El juego se inició para dos jugadores.");
	}

	@Override
	public EstadoMV estadoAlIngresarFicha() {
		return new EstadoMVSinFicha();
	}
}