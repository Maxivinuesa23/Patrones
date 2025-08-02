public class Autorizador {
    public boolean autorizarOperacion(String clave){
        System.out.println("Autorizando operación....");
        return clave.equals("clave123");
    }
}
