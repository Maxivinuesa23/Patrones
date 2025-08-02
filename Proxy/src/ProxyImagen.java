public class ProxyImagen implements Imagen{

    private ImagenReal imagenReal;
    private String archivo;

    public ProxyImagen(String archivo){
        this.archivo = archivo;
    }


    @Override
    public void mostrar() {
        if (imagenReal == null){
            imagenReal = new ImagenReal(archivo);
        }
        imagenReal.mostrar();
    }
}
