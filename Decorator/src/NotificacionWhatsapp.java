public class NotificacionWhatsapp extends NotificacionDecorator{

    public NotificacionWhatsapp(Notificacion envoltorio) {
        super(envoltorio);
    }

    public void enviar(){
        super.enviar();
        System.out.println("Enviando tambien por Whatsapp.");
    }
}
