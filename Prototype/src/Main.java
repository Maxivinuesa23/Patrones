public class Main {
    public static void main(String[] args) {
        Persona personaOriginal = new Persona(30, "Juan");
        Persona personaClonada = (Persona) personaOriginal.clonar();

        System.out.println("Persona Original");
        personaOriginal.mostrarDatos();

        System.out.println("Persona Clonada");
        personaClonada.mostrarDatos();


        System.out.println("Es el mismo? --> " + (personaOriginal == personaClonada));

        // Creamos un enemigo y clonamos.

        Enemigo enemigoOriginal = new Enemigo("Enemigo1", "Mago", 100);
        Enemigo enemigoClonado = (Enemigo) enemigoOriginal.clonar();

        System.out.println("Enemigo Original");
        enemigoOriginal.mostrarDatos();

        System.out.println("Enemigo Clonado");
        enemigoClonado.mostrarDatos();

        System.out.println("Es el mismo?" + (enemigoOriginal == enemigoClonado));
    }
}