package org.example;
public class Main {
    public static void main(String[] args) {
        MacBook miMac = new MacBook();

        CableLightning cableDeMiIphone = new CableLightning();

        System.out.println("Intentando conectar un iPhone con Lightning a un MacBook con USB-C...");

        ConectorUsbC adaptador = new AdaptorLightningAUsbC(cableDeMiIphone);

        miMac.conectarDispositivo(adaptador);
    }
}