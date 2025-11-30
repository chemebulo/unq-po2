package ar.edu.unq.po2.tp11.concurso_preguntas;

public abstract class EstadoSistemaPreguntas {
	private SistemaPreguntas sistema;
	
	public EstadoSistemaPreguntas(SistemaPreguntas sistema) {
		this.sistema = sistema;
	}
	
	public SistemaPreguntas getSistema() {
		return sistema;
	}
	
	public void unirseAPartida(ObserverJugador jugador){
		System.out.println(jugador.getNombre() + ", no se puede entrar en la partida porque no está en sala.");
	}
	
	public void salirDePartida(ObserverJugador jugador){
		System.out.println(jugador.getNombre() + ", no se puede salir de la partida porque no está en sala.");
	}
	
	public void registrarRespuesta(String respuesta, int numeroPregunta, ObserverJugador jugador) {
		System.out.println(jugador.getNombre() + ", no se puede registar una respuesta en una partida que no está en progreso.");
	}

	public void notificarInicio() {
		System.out.println("No puede iniciar una partida en progreso o finalizada.");
	}
	
	public void notificarJugadoresRespuestaCorrecta(int numeroPregunta, ObserverJugador jugador) {
		System.out.println(jugador.getNombre() + ", no se puede notificar una respuesta correcta en una partida que no está en progreso.");
	}
	
	public void notificarGanador(ObserverJugador jugador) {
		System.out.println(jugador.getNombre() + ", no se puede notificar un ganador en una partida que no inició o no finalizó.");
	}

	public void reiniciarPartida() {
		System.out.println("No se puede reiniciar una partida que no inició o se encuentra en progreso.");
	}
	
	public abstract void pasarSiguienteEstado();
}