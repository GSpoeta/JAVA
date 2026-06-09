package Lista5;

import java.util.Scanner;

public class mediaID {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui variaveis para idade soma e contador
        // soma começa com 1 e contador com 1 como no codigo original
        int idade, soma = 1, contador = 1;

        // aqui pede para o usuario digitar as idades
        System.out.println("Digite as idades (Zero para encerrar):");
        
        // aqui le a primeira idade
        idade = sc.nextInt();

        // aqui enquanto a idade for maior ou igual a 1 ele continua lendo
        while (idade >= 1) {
            
            // aqui soma a idade digitada
            soma += idade;
            
            // aqui incrementa o contador
            contador++;
            
            // aqui le a proxima idade
            idade = sc.nextInt();
        }

        // aqui verifica se teve pelo menos uma idade valida
        if (contador > 1) {
            
            // aqui calcula a media das idades
            double media = (double) soma / contador;
            
            // aqui mostra a media
            System.out.println("Média das idades: " + media);
            
        } else {
            // aqui entra se nenhuma idade valida foi informada
            System.out.println("Nenhuma idade válida foi informada.");
        
        }

        // aqui o programa termina poderia fechar o scanner tambem
    }
}