public class Reproduciendo implements Estado {

    @Override
    public void play(Reproductor r) {
        System.out.println("Reproduciendo");
    }

    @Override
    public void pause(Reproductor r) {
        System.out.println("Pausando...");
        r.setEstado(new Pausado());
    }

    @Override
    public void stop(Reproductor r) {
        System.out.println("Deteniendo...");
        r.setEstado(new Detenido());
    }
}
