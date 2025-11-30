package ar.edu.unq.po2.tp12.encriptacion;

public class EncriptadorNaive {
	private EstrategiaEncriptador estrategia;
	
	public EncriptadorNaive(EstrategiaEncriptador estrategia) {
		this.setEstrategia(estrategia);
	}
	
	public void setEstrategia(EstrategiaEncriptador estrategia) {
		this.estrategia = estrategia;
	}
	
	public String encriptar(String texto) {
		return estrategia.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return estrategia.desencriptar(texto);
	}
}