public class DisplayTemperatura implements Observador {
    private String nombre;

    public DisplayTemperatura(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void actualizar(float temperatura) {
        System.out.println(nombre + " muestra nueva temperatura " + temperatura + "°C");
    }
}
