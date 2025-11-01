package com.mycompany.javasenior;

public class JavaSenior {

    public static void main(String[] args) {
        int entero = InputHelper.cargarValor("Ingrese un número entero: ", Integer.class );
        double decimal = InputHelper.cargarValor("Ingrese un número décimal: ", Double.class);
        boolean sw = InputHelper.cargarValor("Ingrese un estado boolean: ", Boolean.class);
        String cadena = InputHelper.cargarValor("Ingrese una cadena de texto: ", String.class);
       
        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(sw);
        System.out.println(cadena);
    }
}
