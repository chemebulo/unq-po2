package ar.edu.unq.po2.tp8.file_system;

import java.time.LocalDate;

public interface FileSystem {
	/** 
	 * Retorna el total ocupado en disco del receptor. Expresado en cantidad de bytes. 
	 */ 
	public int totalSize(); 
	
	/** 
	 * Imprime en consola el contenido indicando el nombre del elemento e indentandolo con tantos espacios como profundidad en la estructura. 
	 */ 
	public void printStructure(); 
	
	/** 
	 * Elemento mas nuevo.
	 */  
	public FileSystem lastModified(); 
	
	/** 
	 * Elemento mas antiguo.
	 */ 
	public FileSystem oldestElement();
	
	/*
	 * Devuelve el nombre del elemento. 
	 */
	public String getName();
	
	/*
	 * Devuelve la fecha de la última modificación del elemento. 
	 */
	public LocalDate getModificationDate();
	
	/*
	 * Devuelve la fecha de creación del elemento. 
	 */
	public LocalDate getCreationDate();
}