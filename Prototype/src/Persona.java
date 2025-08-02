public class Persona implements Clonable{
    private String nombre;
    private int edad;

    public Persona(int edad, String nombre) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public Clonable clonar() {
        return new Persona(this.edad, this.nombre);
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
