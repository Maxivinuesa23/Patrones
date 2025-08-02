public class Main {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();

        bosque.plantarArbol(1, 2, "Pino", "Verde", "rugosa");
        bosque.plantarArbol(3, 4, "Pino", "Verde", "rugosa");
        bosque.plantarArbol(5,6, "Roble", "Rojo", "lisa");
        bosque.plantarArbol(7,8, "Pino", "Verde", "rugosa");

        bosque.mostraBosque();
    }
}