public class CineFacade {
    private Proyector proyector;
    private Luces luces;
    private ReproductorPeliculas reproductorPeliculas;
    private SistemaSonido sistemaSonido;

    public CineFacade(Proyector proyector, Luces luces, ReproductorPeliculas reproductorPeliculas, SistemaSonido sistemaSonido) {
        this.proyector = proyector;
        this.luces = luces;
        this.reproductorPeliculas = reproductorPeliculas;
        this.sistemaSonido = sistemaSonido;
    }

    public void verPelicula(String pelicula){
        System.out.println("Preparando la pelicula...");
        luces.atenuar();
        proyector.encender();
        sistemaSonido.encender();
        reproductorPeliculas.reproducir(pelicula);
    }

    public void terminarPelicula(){
        System.out.println("Terminando la pelicula");
        reproductorPeliculas.detener();
        sistemaSonido.apagar();
        proyector.apagar();
        luces.encender();
    }
}
