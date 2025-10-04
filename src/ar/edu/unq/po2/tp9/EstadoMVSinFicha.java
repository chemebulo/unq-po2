package ar.edu.unq.po2.tp9;

public class EstadoMVSinFicha extends EstadoMV {

	@Override
	public void iniciarJuego() {
		throw new RuntimeException("No se puede iniciar el juego sin ingresar al menos una ficha.");
	}

	@Override
	public EstadoMV estadoAlIngresarFicha() {
		return new EstadoMVConUnaFicha();
	}
}