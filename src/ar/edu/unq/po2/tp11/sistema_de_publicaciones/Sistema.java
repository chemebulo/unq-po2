package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import java.util.ArrayList;
import java.util.List;

public abstract class Sistema {
	private List<Observer> observadores;
	
	public Sistema() {
		this.observadores = new ArrayList<Observer>();
	}
	
	public void suscribir(Observer observer) {
		observadores.add(observer);
	}
	
	public void desuscribir(Observer observer) {
		observadores.remove(observer);
	}
	
	public void notificar(ArticuloAcademico articulo) {
		for(Observer o : observadores) {
			o.actualizar(articulo);
		}
	}
}