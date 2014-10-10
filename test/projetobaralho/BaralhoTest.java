package projetobaralho;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CESAR
 */
public class BaralhoTest {
    
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
    
    @Test
    public void testNumeroDeCartas() {
        System.out.println("testNumeroDeCartas");
        testBaralhoEstaCompleto();  
        System.out.println("");
    }
    
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
