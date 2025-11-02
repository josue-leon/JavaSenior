package logic.numbers;

import java.util.ArrayList;
import java.util.HashMap;

public class SumaDePares {

    /*
    Dado un arreglo de números enteros y un valor objetivo (target), 
    determina si existen dos números diferentes dentro del arreglo cuya suma sea igual al objetivo.
    Si existen, muestra los índices de esos dos números; si no, indica que no hay tal par.
    
    Explicación
    El programa debe encontrar el primer par que cumpla la condición y devolver sus índices.
    No es necesario que haya un solo resultado: si existen varios, basta con mostrar el primero encontrado.
     */
    private ElementoConPosicion encontrarPar(int[] v, int target) {
        MaximoSubarreglo obj = new MaximoSubarreglo();
        ArrayList<ElementoConPosicion> lista = new ArrayList<>();
        lista = obj.calcularSumasSubArray(v);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNumero() == target) {
                //System.out.println(lista.get(i).toString());
                return lista.get(i);
            }
        }
        return null;
    }

    private ElementoConPosicion encontrarParHashMap(int[] v, int target) {
        HashMap<Integer, Integer> mapa = new java.util.HashMap<>();

        for (int i = 0; i < v.length; i++) {
            int complemento = target - v[i];
               //System.out.println("complemento: "+ complemento);
            if (mapa.containsKey(complemento)) {
                // Si encontramos el complemento, construimos el resultado
                int indiceComplemento = mapa.get(complemento);
                ElementoConPosicion resultado = new ElementoConPosicion();
                resultado.setNumero(target); // la suma objetivo
                resultado.setPosInicial(indiceComplemento);
                resultado.setPosFinal(i);
                return resultado;
            }
            mapa.put(v[i], i);
            //System.out.println(mapa.toString());
        }

        return null; 
    }

    public static void ejecutar() {
        int v[] = {10, -2, 5, 7, 1};
        int target = 12;
        SumaDePares obj = new SumaDePares();
        ElementoConPosicion res = new ElementoConPosicion();
        res = obj.encontrarPar(v, target);
        if (res == null) {
            System.out.println("NO HAY EL PAR");
        } else {
            System.out.println(res.toString());

        }
    }
}
