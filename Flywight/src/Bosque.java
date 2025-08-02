import java.util.ArrayList;
import java.util.List;

public class Bosque {
    private List<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(int x, int y, String nombre, String color, String textura){
        TipoArbol tipo = FabricaDeTiposArbol.getTipoArbol(nombre, color, textura);
        Arbol arbol = new Arbol(x, y, tipo);
        arboles.add(arbol);
    }

    public void mostraBosque(){
        for (Arbol arbol : arboles){
            arbol.dibujar();
        }
    }
}
