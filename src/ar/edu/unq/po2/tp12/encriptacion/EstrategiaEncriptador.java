package ar.edu.unq.po2.tp12.encriptacion;

public interface EstrategiaEncriptador {

	public String encriptar(String texto);

	public String desencriptar(String texto);
}