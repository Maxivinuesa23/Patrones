public class ImagenReal implements  Imagen{

    private String archivo;

    public ImagenReal(String archivo){
        this.archivo = archivo;
        cargarDesdeDisco();
    }

    private void cargarDesdeDisco(){
        System.out.println("Cargando " + archivo + " desde disco...");
    }
    @Override
    public void mostrar() {
        System.out.println("Mostrando " + archivo);
    }
}
