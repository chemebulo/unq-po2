package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CriterioAutorTest {
	private CriterioAutor criterio;
	private ArticuloAcademico articulo;
	private Autor autor;
	private List<String> palabrasClave;
	private List<Autor> autores;
	
	@BeforeEach
	void setUp() {
		this.criterio = new CriterioAutor("Carlos Rodriguez");
		
		this.autor = new Autor("Carlos Rodriguez", "Universidad Nacional de Quilmes");
		this.autores = new ArrayList<Autor>();
		autores.add(autor);
		
		this.palabrasClave = new ArrayList<String>();
		String palabra1 = "IA";
		String palabra2 = "Tecnologia";
		palabrasClave.add(palabra1);
		palabrasClave.add(palabra2);
		
		this.articulo = new ArticuloAcademico("IA Avanzada", autores, "Investigacion", "UNQ", palabrasClave);
	}
	
	@Test
	public void funcionamientoGeneral() {
		assertTrue(criterio.cumple(articulo));
	}
}