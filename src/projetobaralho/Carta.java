package projetobaralho;

/*
 COLOCAR NO GIT HUB
 */

/**
 *
 * @author CESAR, Saulo
 */
public class Carta {

    private static final int menorValor = 1;
    private static final int maiorValor = 13;

    private static final int primeiroNaipe = 1;
    private static final int ultimoNaipe = 4;

    private final int valor;
    private final int naipe;

    public Carta(int valor, int naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public static int menorValor() {
        return menorValor;
    }

    public static int maiorValor() {
        return maiorValor;
    }

    public static int primeiroNaipe() {
        return primeiroNaipe;
    }

    public static int ultimoNaipe() {
        return ultimoNaipe;
    }

}
