package ar.edu.unq.po2.tp9.maquina_videojuegos;

public class EstadoMVConDosFichas extends EstadoMV {

	@Override
	public void iniciarJuego() {
		System.out.println("El juego se inició para dos jugadores.");
	}
	
	@Override
	public void ingresarFicha(MaquinaVideojuegos maquinaVideojuegos) {
		maquinaVideojuegos.setEstado(new EstadoMVSinFicha());
	}
}