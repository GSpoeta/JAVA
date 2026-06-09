package Lista4;

import java.util.Scanner;

public class seis {

    public static void main(String[] args) {

        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui pede um caractere pro usuario
        System.out.print("Digite um caractere: ");
        
        // aqui le o caractere digitado e guarda na variavel c
        String c = sc.next();

        // aqui pede um numero pro usuario
        System.out.print("Digite um número: ");
        
        // aqui le o numero digitado e guarda na variavel n
        int n = sc.nextInt();

        // aqui repete o caractere n vezes
        for (int i = 0; i < n; i++) {
            
            // aqui imprime o caractere sem pular linha
            System.out.print(c);
        }

        // aqui o programa termina poderia fechar o scanner tambem
    }
}