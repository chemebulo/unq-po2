package ar.edu.unq.po2.tp11.concurso_preguntas;

public class Finalizado extends EstadoSistemaPreguntas {

	public Finalizado(SistemaPreguntas sistema) {
		super(sistema);
	}

	@Override
	public void notificarGanador(ObserverJugador jugador) {
		System.out.println("El ganador de la partida es: " + jugador.getNombre());
	}
	
	@Override
	public void pasarSiguienteEstado() {
		this.getSistema().setEstado(new Sala(this.getSistema()));
		this.getSistema().getJugadores().clear();
	}
}