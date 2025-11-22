package ar.edu.unq.po2.tp11.sistema_de_publicaciones;

import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaTest {
	private Sistema sistemaDePublicacion;
	private Observer observador;
	private ArticuloAcademico articulo;
	
	@BeforeEach
	public void setUp() {
		this.sistemaDePublicacion = new SistemaDePublicaciones();
		this.observador = mock(Investigador.class);
		this.articulo = mock(ArticuloAcademico.class);
	}
	
	@Test
	public void funcionamientoGeneral() {
		sistemaDePublicacion.suscribir(observador);
		sistemaDePublicacion.notificar(articulo);
		sistemaDePublicacion.desuscribir(observador);
	}
}