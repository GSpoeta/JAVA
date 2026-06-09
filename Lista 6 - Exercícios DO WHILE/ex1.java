package Lista6;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui variavel do numero digitado e soma total
        int num, soma = 0;

        // aqui faz o loop que executa pelo menos uma vez
        do {
            // aqui pede um numero pro usuario
            System.out.print("Digite um número (0 para parar): ");
            
            // aqui le o numero digitado
            num = sc.nextInt();
            
            // aqui vai somando todos os numeros digitados
            soma += num;
            
        // aqui continua enquanto o numero nao for zero
        } while (num != 0);

        // aqui mostra a soma total dos numeros
        System.out.println("Soma total: " + soma);

        // aqui o programa termina poderia fechar o scanner tambem
    }
}