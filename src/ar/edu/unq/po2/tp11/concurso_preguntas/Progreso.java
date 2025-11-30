package ar.edu.unq.po2.tp11.concurso_preguntas;

import java.util.ArrayList;
import java.util.List;

public class Progreso extends EstadoSistemaPreguntas {

	public Progreso(SistemaPreguntas sistema) {
		super(sistema);
	}

	@Override
	public void pasarSiguienteEstado() {
		this.getSistema().setEstado(new Finalizado(this.getSistema()));
	}

	@Override
	public void notificarInicio() {
		for(ObserverJugador jugador : this.getSistema().getJugadores()) {
			jugador.notificarInicio(this.getSistema().getPreguntas(), this.getSistema());
		}
	}

	@Override
	public void registrarRespuesta(String respuesta, int numeroPregunta, ObserverJugador jugador) {
		if(this.esRespuestaCorrecta(respuesta, numeroPregunta)) {
			jugador.notificarRespuestaCorrecta(numeroPregunta);
			this.notificarJugadoresRespuestaCorrecta(numeroPregunta, jugador);
		} else {
			jugador.notificarRespuestaIncorrecta(numeroPregunta);
		}
	}
	
	private boolean esRespuestaCorrecta(String respuesta, int numeroPregunta) {
		return this.getSistema().getPreguntas().get(numeroPregunta).esRespuestaCorrecta(respuesta);
	}
	
	
	@Override
	public void notificarJugadoresRespuestaCorrecta(int numeroPregunta, ObserverJugador jugador) {
		List<ObserverJugador> jugadores = new ArrayList<ObserverJugador>(this.getSistema().getJugadores());
		jugadores.remove(jugador);
		
		for(ObserverJugador j : jugadores) { 
			j.notificarRespuestaCorrectaOtroJugador(numeroPregunta, jugador);
		}
	}
}