package org.example;

public class IteradorDePlaylist implements Iterador<Cancion> {
    private Playlist playlist;
    private int posicionActual = 0;

    public IteradorDePlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean tieneSiguiente() {
        // Hay un siguiente elemento si la posición actual es menor que el tamaño de la lista.
        return posicionActual < playlist.canciones.size();
    }

    @Override
    public Cancion siguiente() {
        // Obtenemos la canción en la posición actual y luego incrementamos el índice.
        Cancion cancion = playlist.canciones.get(posicionActual);
        posicionActual++;
        return cancion;
    }
}
