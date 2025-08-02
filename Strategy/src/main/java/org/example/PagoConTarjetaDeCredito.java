package org.example;

public class PagoConTarjetaDeCredito implements MetodoDePago{
    private String numeroDeTarjeta;
    private String nombreDeltTitular;

    public PagoConTarjetaDeCredito(String numeroDeTarjeta, String nombreDeltTitular) {
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.nombreDeltTitular = nombreDeltTitular;
    }

    @Override
    public void pagar(int monto){
        System.out.println("Pagando " + monto + " con tarjeta de crédito " + numeroDeTarjeta + " a nombre de " + nombreDeltTitular);
        System.out.println("Pago realizado con éxito.");
    }
}
