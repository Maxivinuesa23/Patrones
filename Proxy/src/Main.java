public class Main {
    public static void main(String[] args) {
        //Virtual Proxy

        Imagen imagen1 = new ProxyImagen("foto1.jpg");
        Imagen imagen2 = new ProxyImagen("foto2.jpg");

        System.out.println("Imagenes creadas");
        //Se carga y se muestra por primera vez.
        imagen1.mostrar();
        //Ya esta cargada, solo se muestra.
        imagen1.mostrar();

        //Se carga la 2
        imagen2.mostrar();

    }
}