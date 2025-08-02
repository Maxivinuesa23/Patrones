package org.example;

public class FabricaDeCoches extends FabricaVehiculos{
    @Override
    public Vehiculo crearVehiculo() {
        return new Auto();
    }
}
