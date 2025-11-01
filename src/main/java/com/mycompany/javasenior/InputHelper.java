package com.mycompany.javasenior;

import java.util.Scanner;

public class InputHelper {
    
    // Scanner único, compartido por todos los métodos
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Método genérico para leer distintos tipos de datos desde consola.
     *
     * @param mensaje   Mensaje que se muestra al usuario.
     * @param tipoDato  Tipo de dato esperado (por ejemplo, Integer.class, Double.class, etc.)
     * @return Valor ingresado convertido al tipo correspondiente.
     * @param <T>       Parámetro genérico: el tipo del valor a devolver.
     */
    @SuppressWarnings("unchecked") // suprime el warning de cast genérico (evita ruido)
    public static <T> T cargarValor(String mensaje, Class<T> tipoDato) {
        System.out.print(mensaje + ": ");

        // Dependiendo del tipo de dato solicitado, se lee y castea el valor
        if (tipoDato == Integer.class) {
            while (!scanner.hasNextInt()) {
                System.out.print("Valor inválido. \nIngrese un número entero: ");
                scanner.next(); // descarta la entrada no válida
            }
            return (T) (Integer) scanner.nextInt();

        } else if (tipoDato == Double.class) {
            while (!scanner.hasNextDouble()) {
                System.out.print("Valor inválido. \nIngrese un número decimal: ");
                scanner.next();
            }
            return (T) (Double) scanner.nextDouble();

        } else if (tipoDato == Boolean.class) {
            while (!scanner.hasNextBoolean()) {
                System.out.print("Valor inválido. \nIngrese true o false: ");
                scanner.next();
            }
            return (T) (Boolean) scanner.nextBoolean();

        } else if (tipoDato == String.class) {
            scanner.nextLine(); // limpia buffer
            return (T) scanner.nextLine();

        } else {
            throw new IllegalArgumentException("Tipo no soportado: " + tipoDato);
        }
    }
}
