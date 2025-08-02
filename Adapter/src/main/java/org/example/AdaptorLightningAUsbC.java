package org.example;

public class AdaptorLightningAUsbC implements ConectorUsbC{
    private final ConectorLightning cableLightning;

    public AdaptorLightningAUsbC(ConectorLightning cable){
        this.cableLightning = cable;
    }

    @Override
    public void conectarConUsbC() {
        System.out.println("Adaptando conexión de USB-C a Lightning");
        cableLightning.conectarConLightning();
    }
}
