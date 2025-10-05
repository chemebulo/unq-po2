package ar.edu.unq.po2.tp9.reproductorMP3;

public class Song {
    private String titulo;

    public Song(String titulo) {
        this.titulo = titulo;
    }

    public void play() {
        System.out.println("Reproduciendo: " + titulo);
    }

    public void pause() {
        System.out.println("Pausando: " + titulo);
    }

    public void stop() {
        System.out.println("Deteniendo: " + titulo);
    }
}