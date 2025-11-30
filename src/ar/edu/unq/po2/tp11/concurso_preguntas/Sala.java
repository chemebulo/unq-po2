package ar.edu.unq.po2.tp11.concurso_preguntas;

public class Sala extends EstadoSistemaPreguntas {

	public Sala(SistemaPreguntas sistema) {
		super(sistema);
	}

	@Override
	public void unirseAPartida(ObserverJugador jugador) {
		this.getSistema().añadirJugador(jugador);
		this.empezarPartidaSiEsPosible();
	}
	
	private void empezarPartidaSiEsPosible() {
		if(this.getSistema().listoParaEmpezar()) {
			this.notificarInicio();
			this.pasarSiguienteEstado();
		}
	}
	
	@Override
	public void notificarInicio() {
		for(ObserverJugador jugador : this.getSistema().getJugadores()) {
			jugador.notificarInicio(this.getSistema());
		}
	}

	@Override
	public void salirDePartida(ObserverJugador jugador) {
		this.getSistema().quitarJugador(jugador);
	}

	@Override
	public void pasarSiguienteEstado() {
		this.getSistema().setEstado(new Progreso(this.getSistema()));
	}
}