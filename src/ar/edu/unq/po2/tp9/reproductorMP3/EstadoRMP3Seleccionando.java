package ar.edu.unq.po2.tp9.reproductorMP3;

public class EstadoRMP3Seleccionando implements EstadoReproductorMP3 {

    @Override
    public void play(ReproductorMP3 reproductor) {
        System.out.println("Reproduciendo canción...");
        reproductor.getCancionActual().play();
        reproductor.setEstado(new EstadoRMP3Reproduciendo());
    }

    @Override
    public void pause(ReproductorMP3 reproductor) {
        throw new RuntimeException("Error: No hay ninguna canción que pausar.");
    }

    @Override
    public void stop(ReproductorMP3 reproductor) {
    	throw new RuntimeException("No hay ninguna canción que detener.");
    }
}