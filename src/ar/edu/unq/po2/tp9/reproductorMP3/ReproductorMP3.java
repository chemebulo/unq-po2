package ar.edu.unq.po2.tp9.reproductorMP3;

public class ReproductorMP3 {
	private EstadoReproductorMP3 estado;
	private Song cancionActual;
	
	public ReproductorMP3(Song cancion) {
		this.estado = new EstadoRMP3Seleccionando();
		this.cancionActual = cancion;
	}
	
	public void setEstado(EstadoReproductorMP3 nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public Song getCancionActual() {
        return cancionActual;
    }
	
	public void play() {
		estado.play(this);
	}
	
	public void pause() {
		estado.pause(this);
	}
	
	public void stop() {
		estado.stop(this);
	}
}