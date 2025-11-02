package logic.numbers;

import com.mycompany.javasenior.utils.InputHelper;

public class MayorDeTres {

    private int[] numeros;

    public MayorDeTres() {
    }

    public MayorDeTres(int[] numeros) {
        this.numeros = numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int encontrarMayor() {
        if (numeros == null || numeros.length == 0) 
            throw new IllegalStateException("El arreglo está vacío o no ha sido inicializado.");
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) 
                max = numeros[i];
        }
        return max;
    }

    private static int[] leerNumeros(int cantidad) {
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = InputHelper.cargarValor("Ingrese un número entero: ", Integer.class);
        }
        return numeros;
    }

    public static void ejecutar() {
        int cantidad = InputHelper.cargarValor("Ingrese la cantidad de números a comparar: ", Integer.class);

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        int[] numeros = leerNumeros(cantidad);

        MayorDeTres obj = new MayorDeTres(numeros);
        int mayor = obj.encontrarMayor();

        System.out.println("El mayor es: " + mayor);
    }
}