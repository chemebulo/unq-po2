package ar.edu.unq.po2.tp9;

public abstract class EstadoMV {

	public abstract void iniciarJuego();
	
	public abstract EstadoMV estadoAlIngresarFicha();
	
	public EstadoMV estadoAlTerminarJuego() {
		return new EstadoMVSinFicha();
	}
}