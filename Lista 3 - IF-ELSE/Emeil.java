package Lista3;

import java.util.Scanner;

public class Emeil {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede o email pro usuario
        System.out.print("Digite um e-mail: ");
        
        // aqui le o email digitado e guarda na variavel email
        String email = sc.nextLine();
        
        // aqui verifica se o email tem @ e termina com .com
        if (email.contains("@") && email.endsWith(".com")) {
            // aqui mostra que o email e valido
            System.out.println("E-mail válido.");
        } else {
            // aqui mostra que o email nao e valido
            System.out.println("E-mail inválido.");
        }
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}