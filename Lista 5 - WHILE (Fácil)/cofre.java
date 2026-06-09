package Lista5FA;

public class cofre {
  
    public static void main(String[] args) {
        
        // aqui mostra o titulo do programa
        System.out.println("\n=== Cofre ===");
        
        // aqui inicia o valor do cofre em 0
        int cofre = 0;
        
        // aqui vai acumulando dinheiro ate chegar em 50
        while (cofre < 50) {
            
            // aqui adiciona 5 reais a cada repeticao
            cofre = cofre + 5;
            
            // aqui mostra quanto ja foi guardado no cofre
            System.out.println("Guardando moedas... Total: R$" + cofre);
        }
        
        // aqui mostra quando ja tem dinheiro suficiente
        System.out.println("Dinheiro suficiente para comprar!");
        
    }
   
}