package ar.edu.unq.po2.tp11.concurso_preguntas;

import java.util.ArrayList;
import java.util.List;

public class SistemaPreguntas {
	private List<ObserverJugador> jugadores;
	private List<Pregunta> preguntas;
	private EstadoSistemaPreguntas estadoActual;
		
	public SistemaPreguntas(List<Pregunta> preguntas) {
		this.jugadores = new ArrayList<ObserverJugador>();
		this.preguntas = preguntas;
		this.estadoActual = new Sala(this);
	}
	
	public void unirseAPartida(ObserverJugador jugador) {
		estadoActual.unirseAPartida(jugador);
	}
	
	public void salirDePartida(ObserverJugador jugador) {
		estadoActual.salirDePartida(jugador);
	}
	
	public List<ObserverJugador> getJugadores(){
		return jugadores;
	}
	
	public List<Pregunta> getPreguntas(){
		return preguntas;
	}
	
	public void setEstado(EstadoSistemaPreguntas nuevoEstado) {
		this.estadoActual = nuevoEstado;
	}

	public void registrarRespuesta(String respuesta, int numeroPregunta, ObserverJugador jugador) {
		estadoActual.registrarRespuesta(respuesta, numeroPregunta, jugador);
	}
	
	public void notificarInicio() {
		estadoActual.notificarInicio();
	}
	
	public void notificarGanador(ObserverJugador jugador) {
		estadoActual.notificarGanador(jugador);
	}
	
	public void reiniciar() {
		estadoActual.reiniciarPartida();
	}
	
	public boolean listoParaEmpezar() {
		return jugadores.size() == 5;
	}

	public void añadirJugador(ObserverJugador jugador) {
		this.jugadores.add(jugador);
	}

	public void quitarJugador(ObserverJugador jugador) {
		this.jugadores.remove(jugador);
	}
	
	public String getPregunta(int numeroPregunta) {
		return preguntas.get(numeroPregunta).getPregunta();
	}
	
	public String getRespuesta(int numeroPregunta) {
		return preguntas.get(numeroPregunta).getRespuesta();
	}
}