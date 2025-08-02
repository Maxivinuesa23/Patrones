package org.example;

public enum Singleton {
    INSTANCIA;

    public void mostrarMensaje(){
        System.out.println("¡Hola, soy una instancia única de Singleton!");
    }

    public int sumar(int a, int b) {
        return a + b;
    }

}
