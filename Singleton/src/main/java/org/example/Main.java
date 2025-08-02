package org.example;
public class Main {
    public static void main(String[] args) {
        Singleton miSingleton = Singleton.INSTANCIA;

        miSingleton.mostrarMensaje();

        int resultado = miSingleton.sumar(5, 10);
        System.out.println("El resultado de la suma es: " + resultado);

        Singleton otroSingleton = Singleton.INSTANCIA;
        if (miSingleton == otroSingleton){
            System.out.println("Ambas referencias apuntan a la misma instancia de Singleton.");
        } else {
            System.out.println("Las referencias apuntan a instancias diferentes de Singleton.");
        }
    }
}