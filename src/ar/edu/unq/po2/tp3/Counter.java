package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class Counter {
	private ArrayList<Integer> numeros;
	
	public Counter() {
		this.numeros = new ArrayList<Integer>();
	}
	
	public void añadirNumero(int numero) {
		numeros.add(numero);
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
	
	public int getNumeroConMasPares() {
		return numeros.stream()
					  .max(Comparator.comparingInt(n -> this.cantidadDePares(n)))
					  .orElseThrow(() -> new IllegalStateException("La lista está vacía."));
	}

	private int cantidadDePares(int n) {
		int numero = Math.abs(n);
		int contador = 0;
		
		if(numero == 0) contador++;

		while(numero > 0) {
			int digitoActual = numero % 10;
			
			if(digitoActual % 2 == 0) contador++;
			
			numero /= 10;
		}
		
		return contador;
	}
	
	public int getMultiploMasAltoEntreY(int x, int y) {
		int multiploMasAlto = -1;
		
		if(x > 0 && y > 0) {
			int mcm = (x * y) / this.mcd(x, y);
			int max = (1000 / mcm) * mcm;
			if(max > 0) multiploMasAlto = max;
		}
		
		return multiploMasAlto;
	}
	
	private int mcd(int x, int y) {
		
		while(y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		
		return x;
	}
}