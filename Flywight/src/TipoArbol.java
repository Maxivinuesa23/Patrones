public class TipoArbol {
    private String nombre;
    private String color;
    private String textura;

    public TipoArbol(String nombre, String color, String textura) {
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }

    public void mostrar(int x, int y){
        System.out.println("Dibujando " + nombre + " en (" + x + ", " + y + ") con color " + color + " y textura " + textura);
    }
}
