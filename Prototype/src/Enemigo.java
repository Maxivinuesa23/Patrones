public class Enemigo implements Clonable{
    private String nombre;
    private String tipo;
    private int poder;

    public Enemigo(String nombre, String tipo, int poder) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + "\nTipo: " + tipo + "\nPoder: " + poder);
    }

    @Override
    public Clonable clonar() {
        return new Enemigo(this.nombre, this.tipo, this.poder);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
