package logic.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Dado un arreglo de números enteros, determina cuántas veces aparece cada
 * número y muestra el resultado ordenado por la frecuencia de mayor a menor.
 */
public class FrecuenciaDeElementos {

    private static List<Map.Entry<Integer, Integer>> getFrecuencia(int[] v) {
        HashMap<Integer, Integer> hash = new HashMap();

        for (int i = 0; i < v.length; i++) {
            hash.put(v[i], hash.getOrDefault(v[i], 0) + 1);
        }
        //System.out.println(hash);
        List<Map.Entry<Integer, Integer>> lista = new ArrayList<>(hash.entrySet());
        lista.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //System.out.println(lista);
        return lista;
    }

    private static void mostrarLista(List<Map.Entry<Integer, Integer>> lista) {
        for (Map.Entry<Integer, Integer> elemento : lista) {
            System.out.println("Numero " + elemento.getKey() + " -> " + " aparece " + elemento.getValue() + " veces");
        }
    }

    public static void ejecutar() {
        int v[] = {4, 2, 4, 5, 2, 3, 4, 3, 3, 3};
        List<Map.Entry<Integer, Integer>> lista;
        lista = getFrecuencia(v);
        mostrarLista(lista);
    }
}
