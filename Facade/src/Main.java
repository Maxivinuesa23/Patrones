import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Proyector proyector = new Proyector();
        Luces luces = new Luces();
        SistemaSonido sonido = new SistemaSonido();
        ReproductorPeliculas reproductor = new ReproductorPeliculas();

        CineFacade cine = new CineFacade(proyector, luces, reproductor, sonido);
        Scanner scc = new Scanner(System.in);

        System.out.println("Ingrese el titulo de la pelicula");
        String pelicula = scc.nextLine();
        cine.verPelicula(pelicula);

        System.out.println("\n\n Apagando la pelicula...");
        cine.terminarPelicula();

    }
}