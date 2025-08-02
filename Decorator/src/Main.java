public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new NotificacionBasica();

        //Agregamos decoradores

        notificacion = new NotificacionEmail(notificacion);
        notificacion = new NotificacionWhatsapp(notificacion);

        notificacion.enviar();
    }
}