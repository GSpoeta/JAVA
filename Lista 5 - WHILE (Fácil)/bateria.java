package Lista5FA;

public class bateria {
 
    public static void main(String[] args) {
        
        // aqui mostra o titulo do programa
        System.out.println("\n=== Bateria do Celular ===");
        
        // aqui inicia a bateria em 100 por cento
        int bateria = 100;
        
        // aqui vai diminuindo a bateria enquanto ela for maior que 0
        while (bateria > 0) {
            
            // aqui mostra o nivel atual da bateria
            System.out.println("Bateria: " + bateria + "%");
            
            // aqui diminui a bateria em 20 a cada volta do loop
            bateria = bateria - 20; // mude para 10 para durar mais
        }
        
        // aqui mostra quando a bateria acaba e o celular desliga
        System.out.println("Celular desligou!");
    }  
}