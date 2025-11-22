package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaDePublicacionesTest {
	private SistemaDePublicaciones sistema;
	private Investigador investigador;
	private Conector conector;
	private ArticuloAcademico articulo;
	
	@BeforeEach
	public void setUp() {
		List<Autor> autores = new ArrayList<Autor>();
		Autor autor = new Autor("Carlos Rodriguez", "Universidad Nacional de Quilmes");
		autores.add(autor);
		
		List<String> palabrasClave = new ArrayList<String>();
		String palabra1 = "IA";
		String palabra2 = "Tecnologia";
		palabrasClave.add(palabra1);
		palabrasClave.add(palabra2);
		
		this.articulo = new ArticuloAcademico("IA Avanzada", autores, "Investigacion", "UNQ", palabrasClave);
		
		this.sistema = new SistemaDePublicaciones();
		
		CriterioAutor criterioAutor = new CriterioAutor("Carlos Rodriguez");
		CriterioTitulo criterioTitulo = new CriterioTitulo("Programacion Funcional");
		this.conector = new And(criterioAutor, criterioTitulo);
		this.investigador = new Investigador(conector);
	}
	
	@Test
	public void funcionamientoDelObserverSinNotificar() {
		sistema.suscribir(investigador);
		sistema.publicar(articulo);
		assertTrue(investigador.articulosDeInteres().isEmpty());
	}
	
	@Test
	public void funcionamientoDelObserverNotificando() {
		List<Autor> autores = new ArrayList<Autor>();
		Autor autor = new Autor("Carlos Rodriguez", "Universidad Nacional de Quilmes");
		autores.add(autor);
		
		List<String> palabrasClave = new ArrayList<String>();
		String palabra1 = "IA";
		String palabra2 = "Tecnologia";
		palabrasClave.add(palabra1);
		palabrasClave.add(palabra2);
		
		ArticuloAcademico articulo2 = new ArticuloAcademico("Programacion Funcional", autores, "Investigacion", "UNQ", palabrasClave);
		
		sistema.suscribir(investigador);
		sistema.publicar(articulo2);
		assertFalse(investigador.articulosDeInteres().isEmpty());
	}
}