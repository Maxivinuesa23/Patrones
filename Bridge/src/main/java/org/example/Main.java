package org.example;

public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new Televisor();


        System.out.println("--- Probando TV con Control Básico ---");
        ControlRemotoBasico controlBasicoTv = new ControlRemotoBasico(tv);
        controlBasicoTv.presionarBotonEncendido();
        tv.imprimirEstado();

        System.out.println("\n--- Probando TV con Control Avanzado ---");

        ControlRemotoAvanzado controlAvanzadoTv = new ControlRemotoAvanzado(tv);
        controlAvanzadoTv.silenciar();
        tv.imprimirEstado();
    }
}