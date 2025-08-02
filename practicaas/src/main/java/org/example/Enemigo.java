package org.example;

public class Enemigo implements Clonable{
    private String nombre;
    private String tipo;
    private int poder;

    public Enemigo(String nombre, String tipo, int poder) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
    }

    @Override
    public Clonable clonar() {
        return new Enemigo(this.nombre, this.tipo, this.poder);
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", Tipo: " + tipo + ", Poder: " + poder);
    }
}
