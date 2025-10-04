package ar.edu.unq.po2.tp7;

public class Jugada {
    private TipoJugada tipo;
    private ValorCarta valorPrincipal;

    public Jugada(TipoJugada tipo, ValorCarta valorPrincipal) {
    	this.tipo = tipo;
    	this.valorPrincipal = valorPrincipal;
    }
    
    public TipoJugada getTipo() {
		return tipo;
	}

	public ValorCarta getValorPrincipal() {
		return valorPrincipal;
	}

    public boolean leGanaAJugada(Jugada jugada2) {
    	if(this.tipo.getPrioridad() == jugada2.tipo.getPrioridad()) {
    		return this.valorPrincipal.getValor() > jugada2.valorPrincipal.getValor();
    	}
    	
        return this.tipo.getPrioridad() > jugada2.tipo.getPrioridad();
    }
}