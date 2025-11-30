package ar.edu.unq.po2.tp11.concurso_preguntas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JugadorConcurso implements ObserverJugador {
	private Set<Integer> preguntasPorResponder;
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
	public void notificarInicio(SistemaPreguntas sistema) {
		this.preguntasPorResponder = new HashSet<Integer>(List.of(0,1,2,3,4));
		this.sistemaActual = sistema;
	}
	
	public void registrarRespuesta(String respuesta, int numeroPregunta) {
		if(sistemaActual == null || preguntasPorResponder == null) {
			System.out.println("No se puede registrar una respuesta de una pregunta porque todavía no se unió a ningún juego.");
		} else {
			sistemaActual.registrarRespuesta(respuesta, numeroPregunta, this);
		}
	}

	@Override
	public void notificarRespuestaCorrecta(Integer numeroPregunta) {
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