package org.example;

public class Persona implements Clonable{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public Clonable clonar() {
        return new Persona(this.nombre, this.edad);
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
