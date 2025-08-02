package org.example;
public class Main {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();
        int montoTotal = 1500;


        System.out.println("--- Intento de pago 1 ---");

        MetodoDePago tarjeta = new PagoConTarjetaDeCredito("1234-5678-9012-3456", "Juan Perez");


        carrito.setMetodoDePago(tarjeta);


        carrito.realizarPago(montoTotal);

        System.out.println("\n-----------------------------------\n");


        System.out.println("--- Intento de pago 2 ---");

        MetodoDePago paypal = new PagoConPayPal("juan.perez@email.com");


        carrito.setMetodoDePago(paypal);


        carrito.realizarPago(montoTotal);
    }
}