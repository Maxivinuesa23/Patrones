package org.example;

public class Televisor implements Dispositivo{
    private boolean encendido = false;
    private int volumen = 30;
    private int canal = 1;

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Televisor encendido.");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Televisor apagado.");
    }

    @Override
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void imprimirEstado() {
        System.out.println("--------------------");
        System.out.println("| Estado del Televisor");
        System.out.println("| Encendido: " + (encendido ? "Sí" : "No"));
        System.out.println("| Volumen: " + volumen + "%");
        System.out.println("| Canal: " + canal);
        System.out.println("--------------------\n");
    }
}
