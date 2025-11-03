package logic.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Dado un arreglo de palabras, agrúpalas según su longitud. Cada grupo tendrá
 * todas las palabras que tienen la misma cantidad de letras.
 */
public class AgruparPorLongitud {

    public static HashMap<Integer, ArrayList<String>> agruparPorLongitud(String[] palabras) {
        HashMap<Integer, ArrayList<String>> mapa = new HashMap<>();

        for (String palabra : palabras) {
            int longitud = palabra.length();
            mapa.computeIfAbsent(longitud, k -> new ArrayList<>()).add(palabra);
        }

        return mapa;
    }
    
    public static void mostrarResultados( HashMap<Integer, ArrayList<String>> grupos){
          for (Map.Entry<Integer, ArrayList<String>> entry : grupos.entrySet()) {
            System.out.println("Longitud " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void ejecutar() {
        String palabras[] = {"sol", "luna", "roca", "flor", "mar", "rio"};
        HashMap<Integer, ArrayList<String>> grupos = agruparPorLongitud(palabras);
        mostrarResultados(grupos);
    }

}
