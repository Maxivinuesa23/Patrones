public interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario usuario);
    void agregarUsuario(Usuario usuario);
    void enviarMensajePrivado(String mensaje, Usuario usuario, Usuario usuario2);
}
