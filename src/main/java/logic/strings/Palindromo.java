package logic.strings;

public class Palindromo {

    public static boolean esPalindromo(String texto) {
        String limpio = texto.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversa = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(reversa);
    }

    public static void ejecutar() {
        String frase = "Anita lava la tina";

        if (esPalindromo(frase)) {
            System.out.println("ES PALINDROMO");
        } else {
            System.out.println("NO ES PALINDROMO");
        }
    }
}
