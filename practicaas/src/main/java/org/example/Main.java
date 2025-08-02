package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona personaReal = new Persona("Juan", 30);
        Persona personaClonada = (Persona) personaReal.clonar();

        Enemigo enemigoReal = new Enemigo("Draco", "Dragón", 100);
        Enemigo enemigoClonado = (Enemigo) enemigoReal.clonar();

        System.out.println("Datos de la persona real:");
        personaReal.mostrarDatos();
        System.out.println("Datos de la persona clonada:");
        personaClonada.mostrarDatos();

        System.out.println("Son lo mismo? " + (personaReal == personaClonada));


        System.out.println("Datos del enemigo real:");
        enemigoReal.mostrarDatos();
        System.out.println("Datos del enemigo clonado:");
        enemigoClonado.mostrarDatos();

        System.out.println("Son lo mismo? " + (enemigoReal == enemigoClonado));
    }
}