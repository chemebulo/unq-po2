package ar.edu.unq.po2.tp9.maquina_videojuegos;

public class MaquinaVideojuegos {
	private EstadoMV estado;
	
	public MaquinaVideojuegos() {
		this.estado = new EstadoMVSinFicha();
	}
	
	public void setEstado(EstadoMV estado) {
		this.estado = estado;
	}
	
	public void iniciarJuego() {
		estado.iniciarJuego();
	}
	
	public void ingresarFicha() {
		estado.ingresarFicha(this);
	}
	
	public void terminarJuego() {
		estado.terminarJuego(this);
	}
}