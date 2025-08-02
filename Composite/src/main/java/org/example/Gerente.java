package org.example;

import java.util.ArrayList;
import java.util.List;

public class Gerente implements Empleado {
    private String nombre;
    private String posicion;
    private List<Empleado> equipo = new ArrayList<>();

    public Gerente(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("-> " + this.nombre + ", Posición: " + this.posicion);

        for (Empleado empleado : equipo) {
            empleado.mostrarDetalles();
        }
    }

    public void agregarSubordinado(Empleado empleado) {
        this.equipo.add(empleado);
    }

    public void removerSubordinado(Empleado empleado) {
        this.equipo.remove(empleado);
    }
}
