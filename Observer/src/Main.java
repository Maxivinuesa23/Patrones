public class Main {
    public static void main(String[] args) {
        //Estacion Metereologica

        EstacionMetereologica estacion = new EstacionMetereologica();

        Observador display1 = new DisplayTemperatura("Pantalla 1");
        Observador display2 = new DisplayTemperatura("Pantalla 2");

        estacion.registrarObservador(display1);
        estacion.registrarObservador(display2);

        estacion.setTemperatura(25.0f);
        estacion.setTemperatura(50.0f);

        estacion.eliminarObservador(display1);
        estacion.setTemperatura(15.0f);
    }
}