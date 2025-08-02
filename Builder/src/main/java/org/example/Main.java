package org.example;
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new AutoBuilder("Toyota", "Corolla", 2023)
                .conTechoSolar(true)
                .conGPS(true)
                .conTipoMotor("Híbrido")
                .construir();

        Auto auto2 = new AutoBuilder("Ford", "Fiesta", 2018)
                .conTipoMotor("Naftero")
                .construir();

        System.out.println("=== Auto 1 ===");
        auto1.mostrarDetalles();

        System.out.println("\n=== Auto 2 ===");
        auto2.mostrarDetalles();
    }
}