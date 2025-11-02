package logic.numbers;

import com.mycompany.javasenior.utils.InputHelper;

public class NumeroPrimo {
    
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NumeroPrimo(int numero) {
        this.numero = numero;
    }

    public NumeroPrimo() {
    }
    
    private void leerNumero() {
        do{
            numero = InputHelper.cargarValor("Ingrese un número natural: ", Integer.class);
        }while(numero < 1);
    }
    
    private boolean esPrimo(){
        int raiz = (int) Math.sqrt(numero);
        for (int i = 2; i <= raiz; i++) {
            if(numero % i == 0)
                return false;
        }
        return true;
    }
    
    public static void ejecutar(){
        NumeroPrimo obj = new NumeroPrimo();
        obj.leerNumero();
        if(obj.esPrimo()==true)
            System.out.println("Es Primo");
        else
            System.out.println("No es Primo");
    }
}
