package ar.edu.unq.po2.tp11.encuentros_deportivos;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectServidor {
	private List<ObserverAplicacion> observadores;
	
	public SubjectServidor() {
		this.observadores = new ArrayList<ObserverAplicacion>();
	}
	
	public void suscribir(ObserverAplicacion observer) {
		observadores.add(observer);
	}
	
	public void desuscribir(ObserverAplicacion observer) {
		observadores.remove(observer);
	}
	
	public void notificar(Partido partido) {
		for(ObserverAplicacion o : observadores) {
			o.actualizar(partido);
		}
	}
}