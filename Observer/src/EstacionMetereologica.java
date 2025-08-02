import java.util.ArrayList;
import java.util.List;

public class EstacionMetereologica implements Sujeto{
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura;

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(temperatura);
        }
    }

    public void setTemperatura(float nuevaTemperatura) {
        System.out.println("Temperatura actualizada a " + nuevaTemperatura + "°C");
        this.temperatura = nuevaTemperatura;
        notificarObservadores();
    }
}
