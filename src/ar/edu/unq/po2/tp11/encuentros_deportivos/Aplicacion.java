package ar.edu.unq.po2.tp11.encuentros_deportivos;

import java.util.Set;

public class Aplicacion implements ObserverAplicacion {
	private Set<String> deportesInteres;
	private Set<String> contrincantesInteres;
	
	public Aplicacion(Set<String> deportesInteres, Set<String> contrincantesInteres) {
		this.deportesInteres = deportesInteres;
		this.contrincantesInteres = contrincantesInteres;
	}
	
	@Override
	public void actualizar(Partido partido) {
		if(this.hayContrincanteDeInteres(partido) || this.esDeporteDeInteres(partido)) {
			this.mostrar(partido);
		}
	}
	
	private boolean hayContrincanteDeInteres(Partido partido) {
		return partido.getContrincantes().stream()
										 .anyMatch(c -> contrincantesInteres.contains(c));
	}
	
	private boolean esDeporteDeInteres(Partido partido) {
		return deportesInteres.contains(partido.getDeporte());
	}
	
	private void mostrar(Partido partido) {
		System.out.println("Ha llegado una nueva notificación de " + partido.getDeporte() + "."
						  + "Jugaron " + String.join(", ", partido.getContrincantes()));
	}
}