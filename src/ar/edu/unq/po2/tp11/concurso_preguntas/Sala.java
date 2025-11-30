package ar.edu.unq.po2.tp11.concurso_preguntas;

public class Sala extends EstadoSistemaPreguntas {

	public Sala(SistemaPreguntas sistema) {
		super(sistema);
	}

	@Override
	public void unirseAPartida(ObserverJugador jugador) {
		this.getSistema().getJugadores().add(jugador);
		this.empezarJuegoSiEsPosible();
	}
	
	private void empezarJuegoSiEsPosible() {
		if(getSistema().getJugadores().size() == 5) {
			this.pasarSiguienteEstado();
		}
	}

	@Override
	public void salirDePartida(ObserverJugador jugador) {
		getSistema().getJugadores().remove(jugador);
	}

	@Override
	public void pasarSiguienteEstado() {
		getSistema().setEstado(new Progreso(getSistema()));
		getSistema().notificarInicio();
	}
}