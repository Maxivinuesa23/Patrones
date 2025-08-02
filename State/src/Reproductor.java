public class Reproductor {
    private Estado estado;

    public Reproductor() {
        estado = new Detenido();
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public void play(){
        estado.play(this);
    }

    public void pause(){
        estado.pause(this);
    }

    public void stop(){
        estado.stop(this);
    }

}
