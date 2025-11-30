package ar.edu.unq.po2.tp12.encriptacion;

public class EncriptacionVocal implements EstrategiaEncriptador {

	@Override
	public String encriptar(String texto) {
		int i = 0;
		String encriptado = "";
		Character actual;
		
		while(i < texto.length()) {
			actual = texto.charAt(i);
			
			if(this.esVocal(actual)) {
				encriptado += this.encriptarVocal(actual);
			} 
			else {
				encriptado += actual;
			}
			
			i++;
		}
		
		return encriptado;
	}
	
	private boolean esVocal(Character caracter) {
		return "aeiou".contains(caracter.toString());
	}
	
	private Character encriptarVocal(Character caracter) {
		if (caracter == 'a') return 'e';
		if (caracter == 'e') return 'i';
		if (caracter == 'i') return 'o';
		if (caracter == 'o') return 'u';
		return 'a';
	}

	@Override
	public String desencriptar(String texto) {
		int i = 0;
		String desencriptado = "";
		Character actual;
		
		while(i < texto.length()) {
			actual = texto.charAt(i);
			
			if(this.esVocal(actual)) {
				desencriptado += this.desencriptarVocal(actual);
			} 
			else {
				desencriptado += actual;
			}
			
			i++;
		}
		
		return desencriptado;
	}
	
	private Character desencriptarVocal(Character caracter) {
		if (caracter == 'a') return 'u';
		if (caracter == 'e') return 'a';
		if (caracter == 'i') return 'e';
		if (caracter == 'o') return 'i';
		return 'o';
	}
}