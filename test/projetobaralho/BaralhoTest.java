package projetobaralho;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CESAR
 */
public class BaralhoTest {
    
    /**
     * Está sendo testado apenas se o baralho possui 52 cartas, 
     * poderia ser testado também se as cartas não se repetem (naipe,valor);
     */
    @Test
    public void testBaralhoEstaCompleto() {
        System.out.println("testBaralhoEstaCompleto");
        Baralho instance = new Baralho();
        assertEquals("O baralho não está Completo!", instance.númeroDeCartas(), 52);
        if(instance.númeroDeCartas() == 52){
            System.out.println("O bralho esta completo com 52 cartas");
        }else{
            System.out.println("O bralho esta incompleto");
        }
        System.out.println("");
    }
    
    /**
     * Teste muito bom.
     */
    @Test
    public void testBaralhar() {
        System.out.println("testBaralhar");
        Baralho instance = new Baralho();
        instance.baralhar();
        //verificar se tem todas as cartas dos 4 naipes
        //tem que estar em ordem
        assertFalse(instance.verificaSeBaralhoEmOrdem());
        
        if(instance.verificaSeBaralhoEmOrdem()){
            System.out.println("O baralho esta em ordem");
        }else{
            System.out.println("O bralho não esta em ordem");
        }
        System.out.println("");
    }
    
    /**
     * Achamos que o correto seria testar apenas o número de cartas e não reexecutar o teste de baralho completo, 
     * pois se o primeiro estiver errado este também vai estar.
     */
    @Test
    public void testNumeroDeCartas() {
        System.out.println("testNumeroDeCartas");
        testBaralhoEstaCompleto();  
        System.out.println("");
    }
    
    /**
     * Está executando o mesmo código que está sendo executado em testBaralhar. Poderia ser testado e o objeto retornado é um Baralho com 52 cartas.
     * ex:   instance = new Baralho();
     *       assertTrue(instance != null);
     *       assertTrue(instance instanceof Baralho);
     *       assertEquals(instance.númeroDeCartas(), 52);
     */
    @Test
    public void testBaralhoNovo() {
        System.out.println("testBaralhoNovo");
        Baralho instance = new Baralho();
        //verificar se tem todas as cartas dos 4 naipes
        //tem que estar em ordem
        assertTrue(instance.verificaSeBaralhoEmOrdem());
        
        if(instance.verificaSeBaralhoEmOrdem()){
            System.out.println("O baralho esta em ordem");
        }else{
            System.out.println("O bralho não esta em ordem");
        }
        
        System.out.println("");
    }
    
    /**
     * O teste com o valor da carta ficou muito bom, mas achamos que faltou testar se o número de cartas do baralho reduziu em 1.
     * Faltou o assertXXX() ou lançar a Exception de erro, pois se der erro não será acusado no teste automatizado.
     */
    @Test
    public void testPegaCarta() {
        System.out.println("testPegaCarta");
        Baralho instance = new Baralho();
        //tem que criar uma carta correta
        Carta carta = instance.pegaCarta();
        
        if(carta.getValor() == Carta.menorValor()){
            System.out.println("A carta é de menor valor do naipe " + carta.getNaipe());
        }else if(carta.getValor() == Carta.maiorValor()){
            System.out.println("A carta é de maior valor do naipe " + carta.getNaipe());
        }else{
            System.out.println("A carta é " + carta.getValor() + " do naipe " + carta.getNaipe());
        }
        
        //se for a menor diz, se for maior diz
        //tanto naipe como numero
        System.out.println("");
        
    }
    
    
    
}
