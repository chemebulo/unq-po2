package ar.edu.unq.po2.tp11.concurso_preguntas;

import java.util.List;

public interface ObserverJugador {
	public String getNombre();
	
	public void notificarInicio(List<Pregunta> preguntas, SistemaPreguntas sistema);
	
	public void notificarRespuestaCorrecta(int numeroPregunta);
	
	public void notificarRespuestaIncorrecta(int numeroPregunta);
	
	public void notificarRespuestaCorrectaOtroJugador(int numeroPregunta, ObserverJugador jugador);
}