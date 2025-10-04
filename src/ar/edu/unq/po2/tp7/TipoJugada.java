package ar.edu.unq.po2.tp7;

public enum TipoJugada {
    POQUER(3), COLOR(2), TRIO(1), NADA(0);

    private int prioridad;

    TipoJugada(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}