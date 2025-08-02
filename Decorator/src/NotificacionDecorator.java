public class NotificacionDecorator implements Notificacion{
    protected Notificacion envoltorio;

    public NotificacionDecorator(Notificacion envoltorio) {
        this.envoltorio = envoltorio;
    }

    @Override
    public void enviar() {
        envoltorio.enviar();
    }
}
