package org.example;

public class ControlRemotoBasico {
    protected Dispositivo dispositivo;

    public ControlRemotoBasico(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void presionarBotonEncendido() {
        System.out.println("Control: Presionando botón de encendido...");
        if (dispositivo.estaEncendido()) {
            dispositivo.apagar();
        } else {
            dispositivo.encender();
        }
    }

    public void subirVolumen() {

        System.out.println("Control: Subiendo volumen");
        dispositivo.setVolumen(80);
    }

    public void bajarVolumen() {
        System.out.println("Control: Bajando volumen");
        dispositivo.setVolumen(20);
    }
}
