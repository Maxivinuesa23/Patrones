public class UsuarioConcreto extends  Usuario {
    public UsuarioConcreto(ChatMediator chat, String nombre) {
        super(chat, nombre);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(nombre + " envia: " + mensaje);
        chat.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println(nombre + " recibe: " + mensaje);
    }

    @Override
    public void enviarPrivado(String mensaje, Usuario usuario2) {
        System.out.println(nombre + " envia (privado): " + mensaje);
        chat.enviarMensajePrivado(mensaje, this, usuario2);
    }


}
