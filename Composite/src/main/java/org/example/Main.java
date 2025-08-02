package org.example;
public class Main {
    public static void main(String[] args) {

        Empleado dev1 = new Desarrollador("Ana", "Desarrolladora Frontend");
        Empleado dev2 = new Desarrollador("Juan", "Desarrollador Backend");
        Empleado dev3 = new Desarrollador("Pedro", "Desarrollador QA");


        Gerente gerenteDeIngenieria = new Gerente("Carlos", "Gerente de Ingeniería");
        Gerente gerenteGeneral = new Gerente("Laura", "CEO");


        gerenteDeIngenieria.agregarSubordinado(dev1);
        gerenteDeIngenieria.agregarSubordinado(dev2);


        gerenteGeneral.agregarSubordinado(gerenteDeIngenieria);
        gerenteGeneral.agregarSubordinado(dev3);


        System.out.println("--- Organigrama de la Empresa ---");
        gerenteGeneral.mostrarDetalles();
    }
}
