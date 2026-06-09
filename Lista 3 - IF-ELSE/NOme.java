package Lista3;

import java.util.Scanner;

public class NOme {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede o nome do usuario
        System.out.print("Digite seu nome: ");
        
        // aqui le o nome digitado e guarda na variavel nome
        String nome = sc.nextLine();
        
        // aqui verifica quantos caracteres tem o nome
        if (nome.length() > 5) {
            // aqui entra se o nome tiver mais de 5 caracteres
            System.out.println("Seu nome tem mais de 5 caracteres.");
        } else {
            // aqui entra se tiver 5 ou menos caracteres
            System.out.println("Seu nome tem 5 ou menos caracteres.");
        }
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}