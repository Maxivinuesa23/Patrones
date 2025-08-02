import java.util.ArrayList;
import java.util.List;

public class ChatGrupo implements ChatMediator{
    private List<Usuario> usuarios = new ArrayList<>();


    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensajePrivado(String mensaje, Usuario usuario, Usuario usuario2) {
        if (usuario != usuario2 && usuarios.contains(usuario2)) {
            usuario2.recibir(mensaje);
        }else{
            System.out.println("Receptor no encontrado...");
        }
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario remitente) {
        for (Usuario u : usuarios){
            if (u != remitente){
                u.recibir(mensaje);
            }
        }
    }
}
