package org.example;

public static class AutoBuilder {
    private String marca;
    private String modelo;
    private int año;

    private boolean techoSolar;
    private boolean gps;
    private String tipoMotor;

    public AutoBuilder(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Métodos para configurar los campos opcionales
    public AutoBuilder conTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
        return this;
    }

    public AutoBuilder conGPS(boolean gps) {
        this.gps = gps;
        return this;
    }

    public AutoBuilder conTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
        return this;
    }

    public Auto construir() {
        return new Auto(this);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
