public class NotificacionEmail extends NotificacionDecorator {

    public NotificacionEmail(Notificacion envoltorio) {
        super(envoltorio);
    }

    public void enviar() {
        super.enviar();
        System.out.println("Enviando tambien por Email.");
    }

}
