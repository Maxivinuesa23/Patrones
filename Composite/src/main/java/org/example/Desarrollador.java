package org.example;

public class Desarrollador implements Empleado{
    private String nombre;
    private String posicion;

    public Desarrollador(String nombre, String posicion){
        this.nombre = nombre;
        this.posicion = posicion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("  - " + this.nombre + ", Posición: " + this.posicion);
    }
}
