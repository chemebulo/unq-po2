package ar.edu.unq.po2.tp9.reproductorMP3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReproductorMP3Test {
	private ReproductorMP3 reproductor;
	private Song temaAliceInChains;
	
	
	@BeforeEach
	void setUp() {
		temaAliceInChains = new Song("Alice in Chains - Would?");
		reproductor = new ReproductorMP3(temaAliceInChains);
	}

	@Test
	void testFuncionamientoGeneralReproductor() {
		
		// En el estado "seleccionando" no se puede pausar ni parar la canción.
		assertThrows(RuntimeException.class, () -> reproductor.pause());
		assertThrows(RuntimeException.class, () -> reproductor.stop());
		
		// En el estado "seleccionado" se puede darle play a la canción, cambiando al estado "reproduciendo".
		reproductor.play();
	
		// En el estado "reproduciendo" se puede pausar una canción, cambiando al estado "pausado".
		reproductor.pause();
		
		// En el estado "pausado" se puede pausar una canción para volver al estado "reproduciendo".
		reproductor.pause();
		
		// En el estado "reproduciendo" se puede parar una canción, cambiando al estado "seleccionando".
		reproductor.stop();
		
		// En el estado "seleccionado" se puede darle play a la canción, cambiando al estado "reproduciendo".
		reproductor.play();
		
		// En el estado "reproduciendo" no se puede darle play devuelta.
		assertThrows(RuntimeException.class, () -> reproductor.play());
		
		// En el estado "reproduciendo" se puede pausar una canción, cambiando al estado "pausado".
		reproductor.pause();
		
		// En el estado "pausado" no se puede darle play a la canción.
		assertThrows(RuntimeException.class, () -> reproductor.play());

		// En el estado "pausado" se puede detener la canción, cambiando al estado "seleccionado".
		reproductor.stop();
	}
}