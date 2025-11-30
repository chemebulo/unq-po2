package ar.edu.unq.po2.tp11.concurso_preguntas;

public class Pregunta {
	private String pregunta;
	private String respuesta;
	
	public Pregunta(String pregunta, String respuesta) {
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}
	
	public String getPregunta() {
		return pregunta;
	}
}