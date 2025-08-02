import java.util.HashMap;
import java.util.Map;

public class FabricaDeTiposArbol {
    private static final Map<String, TipoArbol> tipos = new HashMap<>();

    public static TipoArbol getTipoArbol(String nombre, String color, String textura){
        String clave = nombre + "-" + color + "-" + textura;
        if (!tipos.containsKey(clave)){
            System.out.println("Creando nuevo tipo de arbol: " + clave);
            tipos.put(clave, new TipoArbol(nombre, color, textura));
        }
        return tipos.get(clave);
    }
}
