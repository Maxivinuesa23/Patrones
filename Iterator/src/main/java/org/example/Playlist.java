package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements ColeccionAgregada<Cancion> {
    List<Cancion> canciones = new ArrayList<>();

    public void agregarCancion(Cancion cancion) {
        this.canciones.add(cancion);
    }

    @Override
    public Iterador<Cancion> crearIterador() {
        return new IteradorDePlaylist(this);
    }
}
