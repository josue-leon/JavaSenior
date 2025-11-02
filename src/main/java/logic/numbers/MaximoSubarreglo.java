package logic.numbers;

import java.util.ArrayList;

public class MaximoSubarreglo {

    private int[] numeros;

    private static ArrayList<ElementoConPosicion> calcularSumasSubArray(int[] array) {
        int suma;
        ArrayList<ElementoConPosicion> lista = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                suma = 0;
                //System.out.println("i" + ":" + "j");
                //System.out.println(i + ":" + j);
                for (int l = i; l <= j; l++) {
                    //System.out.println(array[l] + " ");
                    suma += array[l];
                }
                // System.out.println("suma " + suma);
                lista.add(new ElementoConPosicion(suma, i, j));
            }
        }
        return lista;
    }
    
    public static ElementoConPosicion maximoSubarray(ArrayList<ElementoConPosicion>  lista ){
        int mayor = Integer.MIN_VALUE;
        ElementoConPosicion resultado = new ElementoConPosicion();
        for (ElementoConPosicion elemento : lista) {
            if(elemento.getNumero() > mayor){
                mayor = elemento.getNumero();
                resultado = elemento;
            }
        }
        return resultado;
    }
    
    public static void mostrarArray(int[] array, int posInicial, int posFinal){
        for (int i = posInicial; i <= posFinal; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void ejecutar() {
        //Entrada
        int v[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        //Proceso
        
        ArrayList<ElementoConPosicion> listaSumasSubArray = new ArrayList<>();
        listaSumasSubArray = calcularSumasSubArray(v);
        
        ElementoConPosicion mejor = maximoSubarray(listaSumasSubArray);

        //Salida
        System.out.println("Suma: "+mejor.getNumero());
        System.out.println("Index Inicio: "+mejor.getPosInicial());
        System.out.println("Indes Final: "+mejor.getPosFinal());
        System.out.print("Subarray: ");
        mostrarArray(v, mejor.getPosInicial(), mejor.getPosFinal());
       
    }
}
