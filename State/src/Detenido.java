public class Detenido implements Estado {

    @Override
    public void play(Reproductor r) {
        System.out.println("Iniciando reproducción...");
        r.setEstado(new Reproduciendo());
    }

    @Override
    public void pause(Reproductor r) {
        System.out.println("No se puede pausar si está detenido.");
    }

    @Override
    public void stop(Reproductor r) {
        System.out.println("Ya está detenido.");
    }
}
