package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Counter {
	private ArrayList<Integer> numeros;
	
	public Counter() {
		this.numeros = new ArrayList<Integer>();
	}
	
	public int contarSi(Predicate<Integer> condicion) {
		return (int) numeros.stream()
							.filter(condicion)
							.count();
	}
	
	public int getCantidadDePares() {
		return this.contarSi(n -> this.esMultiploDe(n, 2));
	}
	
	public int getCantidadDeImpares() {
		return this.contarSi(n -> !this.esMultiploDe(n, 2));
	}
	
	public int getCantidadDeMultiplosDe(int divisor) {
		return this.contarSi(n -> this.esMultiploDe(n, divisor));
	}
	
	public boolean esMultiploDe(int numero, int divisor) {
		return numero % divisor == 0;
	}
	
	public void añadirNumero(int numero) {
		numeros.add(numero);
	}
}