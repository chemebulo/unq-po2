package ar.edu.unq.po2.tp9.maquina_videojuegos;

public class MaquinaVideojuegos {
	private EstadoMV estado;
	
	public MaquinaVideojuegos() {
		this.estado = new EstadoMVSinFicha();
	}
	
	public void iniciarJuego() {
		estado.iniciarJuego();
	}
	
	public void ingresarFicha() {
		estado = estado.estadoAlIngresarFicha();
	}
	
	public void terminarJuego() {
		estado = estado.estadoAlTerminarJuego();
	}
}