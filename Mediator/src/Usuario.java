public abstract class Usuario {
    protected ChatMediator chat;
    protected String nombre;

    public Usuario(ChatMediator chat, String nombre) {
        this.chat = chat;
        this.nombre = nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
    public abstract void enviarPrivado(String mensaje, Usuario usuario2);

}
