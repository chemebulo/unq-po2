package ar.edu.unq.po2.tp7;

public class Carta {
	private ValorCarta valor;
	private PaloCarta palo;
	
	public Carta(ValorCarta valor, PaloCarta palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public int getValor() {
		return valor.getValor();
	}
	
	public String getPalo() {
		return palo.getPalo();
	}
}