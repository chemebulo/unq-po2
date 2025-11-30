package ar.edu.unq.po2.tp11.encuentros_deportivos;

public class ServidorResultados extends SubjectServidor {
	
	public void añadirPartido(Partido partido) {
		this.notificar(partido);
	}
}