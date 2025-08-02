package org.example;

public interface Dispositivo {
    boolean estaEncendido();
    void encender();
    void apagar();
    void setVolumen(int volumen);
    void setCanal(int canal);
    void imprimirEstado();
}
