public class Pausado implements  Estado{

    @Override
    public void play(Reproductor r) {
        System.out.println("Reanudando reproduccion...");
        r.setEstado(new Reproduciendo());
    }

    @Override
    public void pause(Reproductor r) {
        System.out.println("Ya esta pausado");
    }

    @Override
    public void stop(Reproductor r) {
        System.out.println("Deteniendo desde pausa...");
        r.setEstado(new Detenido());
    }
}
