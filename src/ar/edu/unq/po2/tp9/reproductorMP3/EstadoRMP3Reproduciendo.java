package ar.edu.unq.po2.tp9.reproductorMP3;

public class EstadoRMP3Reproduciendo implements EstadoReproductorMP3 {

    @Override
    public void play(ReproductorMP3 reproductor) {
    	throw new RuntimeException("Error: ya se está reproduciendo una canción.");
    }

    @Override
    public void pause(ReproductorMP3 reproductor) {
        System.out.println("Pausando canción...");
        reproductor.getCancionActual().pause();
        reproductor.setEstado(new EstadoRMP3Pausado());
    }

    @Override
    public void stop(ReproductorMP3 reproductor) {
        System.out.println("Deteniendo reproducción...");
        reproductor.getCancionActual().stop();
        reproductor.setEstado(new EstadoRMP3Seleccionando());
    }
}