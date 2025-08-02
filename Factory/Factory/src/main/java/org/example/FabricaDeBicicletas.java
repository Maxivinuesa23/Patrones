package org.example;

public class FabricaDeBicicletas extends FabricaVehiculos {
    @Override
    public Vehiculo crearVehiculo() {
        return new Bicicleta();
    }
}
