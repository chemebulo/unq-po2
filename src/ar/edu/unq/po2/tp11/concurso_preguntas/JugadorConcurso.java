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
	
	@Override
	public void notificarRespuestaCorrecta(int numeroPregunta) {
		this.preguntasPorResponder.remove(numeroPregunta);
		
		if(preguntasPorResponder.isEmpty()) {
			sistemaActual.notificarGanador(this);
		}
	}

	public void registrarRespuesta(String respuesta, int numeroPregunta) {
		sistemaActual.registrarRespuesta(respuesta, numeroPregunta, this);
	}

	@Override
	public void notificarRespuestaCorrectaOtroJugador(int numeroPregunta, ObserverJugador jugador) {
		System.out.println(nombre 
						   + ", el jugador " 
						   + jugador.getNombre() 
						   + " respondió correctamente la pregunta: " 
						   + sistemaActual.getPreguntas().get(numeroPregunta).getPregunta()
						   );
	}

	@Override
	public void notificarRespuestaIncorrecta(int numeroPregunta) {
		System.out.println(nombre
							+ ", tu respuesta registrada en la pregunta: "
						    + sistemaActual.getPreguntas().get(numeroPregunta).getPregunta()
						    + " es incorrecta.");
	}
}