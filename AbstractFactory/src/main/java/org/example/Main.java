package org.example;
public class Main {
    public static void main(String[] args) {
        String sistemaOperativo = "macOS";
        GUIFactory fabrica;

        // Decidimos qué fábrica usar según la configuración.
        if (sistemaOperativo.equalsIgnoreCase("macOS")) {
            fabrica = new MacOSFactory(); // 🍎
        } else {
            fabrica = new WindowsFactory(); // 💻
        }

        // Creamos la aplicación pasándole la fábrica seleccionada.
        // La aplicación no sabe qué estilo se usará, solo sabe que recibirá
        // componentes que son compatibles entre sí.
        Aplication app = new Aplication(fabrica);
        app.pintarUI();
    }
}