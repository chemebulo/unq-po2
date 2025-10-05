package ar.edu.unq.po2.tp9.maquina_videojuegos;

public abstract class EstadoMV {

	public abstract void iniciarJuego();
	
	public abstract void ingresarFicha(MaquinaVideojuegos maquinaVideojuegos);
	
	public void terminarJuego(MaquinaVideojuegos maquinaVideojuegos) {
		maquinaVideojuegos.setEstado(new EstadoMVSinFicha());
	}
}