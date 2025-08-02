package org.example;

public class CarritoDeCompras {
    private MetodoDePago metodoDePago;

    public void setMetodoDePago(MetodoDePago metodo){
        this.metodoDePago = metodo;
    }

    public void realizarPago(int monto) {
        if (metodoDePago == null) {
            System.out.println("No se ha seleccionado un método de pago.");
            return;
        }
        metodoDePago.pagar(monto);
    }
}
