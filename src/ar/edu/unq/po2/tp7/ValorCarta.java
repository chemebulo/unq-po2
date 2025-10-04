package ar.edu.unq.po2.tp7;

public enum ValorCarta {
    DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8),
    NUEVE(9), DIEZ(10), J(11), Q(12), K(13), A(14);

    private int valor;

    ValorCarta(int valor) { 
    	this.valor = valor; 
    }
    
    public int getValor() { 
    	return valor; 
    }
}