package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Usando la fábrica de coches...");
        FabricaVehiculos fabricaCoches = new FabricaDeCoches();
        fabricaCoches.entregarVehiculo();

        System.out.println("\n--------------------------------\n");

        System.out.println("Usando la fábrica de bicicletas...");
        FabricaVehiculos fabricaBicicletas = new FabricaDeBicicletas();
        fabricaBicicletas.entregarVehiculo();
    }
}
