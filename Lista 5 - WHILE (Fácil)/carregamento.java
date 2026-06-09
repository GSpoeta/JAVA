package Lista5FA;

public class carregamento {
   
    public static void main(String[] args) {
        
        // aqui mostra o titulo do programa
        System.out.println("\n=== Loading ===");
        
        // aqui inicia o progresso do download em 0
        int progresso = 0;
        
        // aqui vai aumentando o progresso ate 100
        while (progresso <= 100) {
            
            // aqui mostra o percentual de carregamento
            System.out.println("Carregando... " + progresso + "%");
            
            // aqui aumenta o progresso em 10 a cada volta do loop
            progresso = progresso + 10;
        }
        
        // aqui mostra quando o download termina
        System.out.println("Download concluído!");
    }
}