public class Main {
    public static void main(String[] args) {

        //Chat entre usuarios
        ChatMediator chat = new ChatGrupo();

        Usuario u1 = new UsuarioConcreto(chat, "Ana");
        Usuario u2 = new UsuarioConcreto(chat, "Máximo");
        Usuario u3 = new UsuarioConcreto(chat, "Joaquin");
        Usuario u4 = new UsuarioConcreto(chat, "Nao");

        chat.agregarUsuario(u1);
        chat.agregarUsuario(u2);
        chat.agregarUsuario(u3);

        u1.enviar("Hola a todos");
        u2.enviar("Hola Ana!");
        System.out.println("----------------------");
        u1.enviarPrivado("Hola Máximo", u2);
        System.out.println("----------------------");
        u2.enviarPrivado("Hola", u4);
    }
}