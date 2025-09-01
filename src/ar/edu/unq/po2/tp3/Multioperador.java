package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> numeros;
	
	public Multioperador() {
		this.numeros = new ArrayList<Integer>();
	}
	
	public void añadirNumero(int n) {
        numeros.add(n);
    }
	
	public int multiplicarNumeros() {
		int resultado = -1;
		
		if(!numeros.isEmpty()) {
			resultado = 1;
			
			for(int n : numeros) {
				resultado *= n;
			}
		}
		
		return resultado;
	}
	
	public int sumarNumeros() {
		int resultado = 0;
		
		for(int n : numeros) {
			resultado += n;
		}
		
		return resultado;
	}
	
	public int restarNumeros() {
		int resultado = 0;
		
		if(!numeros.isEmpty()) {
			resultado = numeros.get(0);
			
			for(int i = 1; i < numeros.size(); i++) {
				resultado -= numeros.get(i);
			}
		}
		
		return resultado;
	}
}