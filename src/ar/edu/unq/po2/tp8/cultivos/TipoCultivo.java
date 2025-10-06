package ar.edu.unq.po2.tp8.cultivos;

public enum TipoCultivo {
	SOJA(500), TRIGO(300);
	
	private int ganancia;
	
	TipoCultivo(int ganancia) { 
    	this.ganancia = ganancia; 
    }
    
    public int getGananciaAnual() { 
    	return ganancia; 
    }
}