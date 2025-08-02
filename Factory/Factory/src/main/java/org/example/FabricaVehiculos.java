package org.example;

public abstract class FabricaVehiculos {

    public abstract Vehiculo crearVehiculo();

    public void entregarVehiculo() {
        Vehiculo vehiculo = crearVehiculo();
        System.out.print("Iniciando entrega: ");
        vehiculo.moverse();
    }
}
