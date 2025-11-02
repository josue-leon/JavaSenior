
package logic.numbers;


public class ElementoConPosicion {
    private int numero;
    private int posInicial;
    private int posFinal;

    public ElementoConPosicion(int numero, int posInicial, int posFinal) {
        this.numero = numero;
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ElementoConPosicion() {
    }

    public void setPosInicial(int posInicial) {
        this.posInicial = posInicial;
    }

    public void setPosFinal(int posFinal) {
        this.posFinal = posFinal;
    }

    public int getNumero() {
        return numero;
    }

    public int getPosInicial() {
        return posInicial;
    }

    public int getPosFinal() {
        return posFinal;
    }
}
