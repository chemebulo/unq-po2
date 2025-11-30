package ar.edu.unq.po2.tp11.concurso_preguntas;

import java.util.ArrayList;
import java.util.List;

public class Finalizado extends EstadoSistemaPreguntas {

	public Finalizado(SistemaPreguntas sistema) {
		super(sistema);
	}

	@Override
	public void notificarGanador(ObserverJugador jugador) {
		List<ObserverJugador> jugadoresANotificar = new ArrayList<ObserverJugador>(this.getSistema().getJugadores());
		jugadoresANotificar.remove(jugador);
		
		for(ObserverJugador j : jugadoresANotificar) {
			j.notificarGanador(jugador);
		}
	}
	
	@Override
	public void pasarSiguienteEstado() {
		this.getSistema().setEstado(new Sala(this.getSistema()));
		this.getSistema().getJugadores().clear();
	}
}