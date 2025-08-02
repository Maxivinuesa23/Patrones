package org.example;

public class PagoConPayPal implements MetodoDePago {
    private String email;

    public PagoConPayPal(String email) {
        this.email = email;
    }

    @Override
    public void pagar(int monto) {
        System.out.println("Procesando pago de $" + monto + " a través de PayPal.");
        // Lógica para redirigir a PayPal, verificar la cuenta, etc.
        System.out.println("Pago realizado exitosamente desde la cuenta de PayPal: " + this.email);
    }
}
