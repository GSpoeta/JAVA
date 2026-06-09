package Lista1;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        // aqui ta criando o scanner pra ler o que o usuario digitar no teclado
        Scanner sc = new Scanner(System.in);

        // aqui pede pro usuario digitar um numero inteiro
        System.out.print("Digite um número inteiro: ");
        
        // aqui ele le o numero que o usuario digitou e guarda na variavel num
        int num = sc.nextInt();

        // aqui ele mostra o antecessor do numero digitado ou seja o numero menos 1
        System.out.println("Antecessor: " + (num - 1));
        
        // aqui ele mostra o sucessor do numero digitado ou seja o numero mais 1
        System.out.println("Sucessor: " + (num + 1));

        // aqui fecha o scanner depois de usar pra liberar recurso
        sc.close();
    }
}