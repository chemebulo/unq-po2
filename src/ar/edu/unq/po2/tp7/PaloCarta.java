package ar.edu.unq.po2.tp7;

public enum PaloCarta {
    PICAS("P"), CORAZONES("C"), DIAMANTES("D"), TREBOLES("T");
	
	private String palo;
	
	PaloCarta(String palo) { 
    	this.palo = palo; 
    }
    
    public String getPalo() { 
    	return palo; 
    }
}