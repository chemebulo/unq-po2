package ar.edu.unq.po2.tp11.concurso_preguntas;

import java.util.ArrayList;
import java.util.List;

public class JugadorConcurso implements ObserverJugador {
	private List<Pregunta> preguntasPorResponder;
	private SistemaPreguntas sistemaActual;
	private String nombre;
	
	public JugadorConcurso(String nombre) {
		this.preguntasPorResponder = null;
		this.sistemaActual = null;
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public void notificarInicio(List<Pregunta> preguntas, SistemaPreguntas sistema) {
		this.preguntasPorResponder = new ArrayList<Pregunta>(preguntas);
		this.sistemaActual = sistema;
	}
	
	public void registrarRespuesta(String respuesta, int numeroPregunta) {
		sistemaActual.registrarRespuesta(respuesta, numeroPregunta, this);
	}

	@Override
	public void notificarRespuestaCorrecta(int numeroPregunta) {
		this.preguntasPorResponder.remove(numeroPregunta);
	}
	
	@Override
	public boolean tienePreguntasPorResponder() {
		return !preguntasPorResponder.isEmpty();
	}

	@Override
	public void notificarRespuestaCorrectaOtroJugador(int numeroPregunta, ObserverJugador jugador) {
		System.out.println(nombre 
						   + ", el jugador " 
						   + jugador.getNombre() 
						   + " respondió correctamente la pregunta: " 
						   + sistemaActual.getPregunta(numeroPregunta)
						   );
	}

	@Override
	public void notificarRespuestaIncorrecta(int numeroPregunta) {
		System.out.println(nombre
							+ ", tu respuesta registrada en la pregunta: "
						    + sistemaActual.getPregunta(numeroPregunta)
						    + " es incorrecta.");
	}

	@Override
	public void notificarGanador(ObserverJugador jugador) {
		System.out.println("El ganador de la partida es: " + jugador.getNombre());
	}
}