package Lista6;

public class ex3 {
    public static void main(String[] args) throws InterruptedException {
        
        // aqui inicia o contador em 10
        int i = 10;

        // aqui faz o loop pelo menos uma vez e vai ate 1
        do {
            
            // aqui mostra o valor atual do contador
            System.out.println(i);
            
            // aqui espera 1 segundo antes de continuar
            Thread.sleep(1000); 
            
            // aqui decrementa o contador
            i--;
            
        } while (i >= 1);
        
        // aqui o programa termina quando chega em 1
    }
}