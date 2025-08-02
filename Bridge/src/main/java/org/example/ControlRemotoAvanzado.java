package org.example;

public class ControlRemotoAvanzado extends ControlRemotoBasico {
    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silenciar() {
        System.out.println("Control Avanzado: Presionando botón de silencio");
        dispositivo.setVolumen(0);
    }
}
