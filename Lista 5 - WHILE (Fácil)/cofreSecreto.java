package Lista5FA;

import java.util.Scanner;

public class cofreSecreto {
 
    public static void main(String[] args) {
        
        // aqui mostra o titulo do programa
        System.out.println("\n=== Cofre Secreto ===");
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner scanner = new Scanner(System.in);
        
        // aqui inicializa a senha vazia pra entrar no loop
        String senha = "";

        // aqui fica repetindo enquanto a senha nao for 1234
        while (!senha.equals("1234")) {
            
            // aqui pede a senha pro usuario
            System.out.print("Digite a senha: ");
            
            // aqui le a senha digitada
            senha = scanner.nextLine();
        }

        // aqui mostra quando a senha estiver correta
        System.out.println("Cofre aberto!");

        // aqui fecha o scanner depois de usar
        scanner.close();
    }
}