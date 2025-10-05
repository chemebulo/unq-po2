package ar.edu.unq.po2.tp9.reproductorMP3;

public class EstadoRMP3Pausado implements EstadoReproductorMP3 {

    @Override
    public void play(ReproductorMP3 reproductor) {
    	throw new RuntimeException("Error: la canción está pausada.");
    }

    @Override
    public void pause(ReproductorMP3 reproductor) {
        System.out.println("Reanudando canción...");
        reproductor.getCancionActual().play();
        reproductor.setEstado(new EstadoRMP3Reproduciendo());
    }

    @Override
    public void stop(ReproductorMP3 reproductor) {
        System.out.println("Deteniendo canción pausada...");
        reproductor.getCancionActual().stop();
        reproductor.setEstado(new EstadoRMP3Seleccionando());
    }
}