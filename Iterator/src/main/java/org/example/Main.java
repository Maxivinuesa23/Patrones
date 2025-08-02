package org.example;
public class Main {
    public static void main(String[] args) {

        Playlist miPlaylist = new Playlist();
        miPlaylist.agregarCancion(new Cancion("Bohemian Rhapsody - Queen"));
        miPlaylist.agregarCancion(new Cancion("Stairway to Heaven - Led Zeppelin"));
        miPlaylist.agregarCancion(new Cancion("Hotel California - Eagles"));


        Iterador<Cancion> iterador = miPlaylist.crearIterador();


        System.out.println("Reproduciendo playlist:");
        while (iterador.tieneSiguiente()) {
            Cancion cancionActual = iterador.siguiente();
            System.out.println("->️  " + cancionActual.getNombre());
        }
    }
}