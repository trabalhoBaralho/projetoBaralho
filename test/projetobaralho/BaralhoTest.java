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
    }
    
    @Test
    public void testBaralhar() {
        Baralho instance = new Baralho();
        //verificar se tem todas as cartas dos 4 naipes
        //tem que estar embaralhado
        
    }
    
    @Test
    public void testNumeroDeCartas() {
        Baralho instance = new Baralho();
        //igual ao baralho esta completo
        
    }
    
    @Test
    public void testBaralhoNovo() {
        Baralho instance = new Baralho();
        //verificar se tem todas as cartas dos 4 naipes
        //tem que estar em ordem
        
    }
    
    @Test
    public void testPegaCarta() {
        Baralho instance = new Baralho();
        //tem que criar uma carta correta
        Carta carta = instance.pegaCarta();
        
        //se for a menor diz, se for maior diz
        //tanto naipe como numero
        
    }
    
    
    
}