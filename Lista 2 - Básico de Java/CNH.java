package Lista2;

import java.util.Scanner;

public class CNH {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner scanner = new Scanner(System.in);

        // aqui pede a idade da pessoa
        System.out.print("Digite sua idade: ");
        
        // aqui le a idade digitada e guarda na variavel idade
        int idade = scanner.nextInt();

        // aqui pergunta se a pessoa possui cnh true ou false
        System.out.print("Possui CNH? (true/false): ");
        
        // aqui le a resposta e guarda na variavel possuiCNH
        boolean possuiCNH = scanner.nextBoolean();

        // aqui verifica se a pessoa pode dirigir
        // precisa ser maior ou igual a 18 e ter cnh
        boolean podeDirigir = (idade >= 18) && (possuiCNH);

        // aqui entra se puder dirigir
        if (podeDirigir) {
            // aqui mostra que pode dirigir
            System.out.println("Você pode dirigir.");
        } else {
            // aqui entra se nao puder dirigir
            // aqui mostra que nao pode dirigir
            System.out.println("Você não pode dirigir.");
        }

        // aqui fecha o scanner depois de usar
        scanner.close();
    }
}