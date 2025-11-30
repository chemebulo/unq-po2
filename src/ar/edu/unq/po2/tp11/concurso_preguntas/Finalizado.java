package ar.edu.unq.po2.tp11.concurso_preguntas;

public class Finalizado extends EstadoSistemaPreguntas {

	public Finalizado(SistemaPreguntas sistema) {
		super(sistema);
	}
	
	@Override
	public void reiniciarPartida() {
		this.pasarSiguienteEstado();
		this.getSistema().getJugadores().clear();
	}
	
	@Override
	public void pasarSiguienteEstado() {
		this.getSistema().setEstado(new Sala(this.getSistema()));
	}
}