package ar.edu.unq.po2.tp11.concurso_preguntas;

public interface ObserverJugador {
	public String getNombre();
	
	public boolean tienePreguntasPorResponder();
	
	public void notificarInicio(SistemaPreguntas sistema);
	
	public void notificarRespuestaCorrecta(Integer numeroPregunta);
	
	public void notificarRespuestaIncorrecta(int numeroPregunta);
	
	public void notificarGanador(ObserverJugador jugador);
	
	public void notificarRespuestaCorrectaOtroJugador(int numeroPregunta, ObserverJugador jugador);
}