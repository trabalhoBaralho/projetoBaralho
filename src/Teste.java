/**
 *
 * @author CESAR
 */
public class Teste {
    
    static Baralho baralho = new Baralho();

    public Teste() {
        Baralho baralho = new Baralho();
        baralhoEstaCompleto();
        
    }
    
    public void baralhoEstaCompleto(){
        //o total de cartas deve ser 13 * 4 = 52
        if(baralho.númeroDeCartas() == 52){
            System.out.println("O baralho está completo!");
        }else{
            System.err.println("O baralho está incompleto!");
        }
    }
    
    
    public static void main(String[] args) {
        Teste t = new Teste();
    }
    
}
