package org.example;

public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private boolean techoSolar;
    private boolean gps;
    private String tipoMotor;

    private Auto(AutoBuilder builder){
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.año = builder.año;
        this.techoSolar = builder.techoSolar;
        this.gps = builder.gps;
        this.tipoMotor = builder.tipoMotor;
    }

    public void mostrarDetalles(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Techo Solar: " + (techoSolar ? "Sí" : "No"));
        System.out.println("GPS: " + (gps ? "Sí" : "No"));
        System.out.println("Tipo de Motor: " + tipoMotor);
    }
}
