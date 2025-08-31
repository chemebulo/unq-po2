package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numeros;
	
	public Counter() {
		this.numeros = new ArrayList<Integer>();
	}
	
	public int getCantidadDePares() {
		return (int) numeros.stream()
							.filter(n -> this.esMultiploDe(n, 2))
							.count();
	}
	
	public int getCantidadDeImpares() {
		return (int) numeros.stream()
							.filter(n -> !this.esMultiploDe(n, 2))
							.count();
	}
	
	public int getCantidadDeMultiplosDe(int divisor) {
		return (int) numeros.stream()
							.filter(n -> this.esMultiploDe(n, divisor))
							.count();
	}
	
	public boolean esMultiploDe(int numero, int divisor) {
		return numero % divisor == 0;
	}
	
	public void addNumero(int numero) {
		numeros.add(numero);
	}
}