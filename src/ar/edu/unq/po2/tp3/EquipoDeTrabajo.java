package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<Persona>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void addIntegrante(Persona persona) {
		integrantes.add(persona);
	}
	
	public int getPromedioEdadIntegrantes() {
		int resultado = 0;		
		
		if(!integrantes.isEmpty()) {
			int suma = integrantes.stream()
		  			  			  .mapToInt(i -> i.getEdad())
		  			  			  .sum();
				
			resultado = suma / integrantes.size();
		}
		
		return resultado;
	}
}