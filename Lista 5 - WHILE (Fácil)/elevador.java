package Lista5FA;

public class elevador {
 
    public static void main(String[] args) {
        
        // aqui mostra o titulo do programa
        System.out.println("\n=== Elevador ===");
        
        // aqui inicia o andar em 0
        int andar = 0;
        
        // aqui vai subindo os andares ate chegar no 5
        while (andar < 5) {
            
            // aqui sobe um andar a cada repeticao
            andar = andar + 1;
            
            // aqui mostra em qual andar o elevador esta
            System.out.println("Andar número: " + andar);
        }
        
        // aqui mostra quando o elevador chega no topo
        System.out.println("Chegou ao topo!");
    
    } 
}