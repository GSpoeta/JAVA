package Lista5;

import java.util.Scanner;

public class tabuadi {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
    
        // aqui inicializa o numero com -1 pra entrar no loop
        int numero = -1;

        // aqui fica repetindo ate o usuario digitar um numero positivo
        while (numero <= 0) {
            
            // aqui pede um numero positivo pro usuario
            System.out.println("\nDigite um número positivo para ver a tabuada:");
            
            // aqui le o numero digitado
            numero = sc.nextInt();

            // aqui valida se o numero e invalido
            if (numero <= 0) {
                System.out.println("Número inválido! Digite novamente.");
            }
        }

        // aqui inicia o contador da tabuada
        int i = 1;
        
        // aqui mostra o titulo da tabuada
        System.out.println("\nTabuada do " + numero + ":");

        // aqui faz a tabuada de 1 ate 10
        while (i <= 10) {
            
            // aqui mostra a multiplicacao
            System.out.println(numero + " x " + i + " = " + (numero * i));
            
            // aqui incrementa o contador
            i++;
        }

        // aqui o programa termina poderia fechar o scanner tambem
    }
}