package Lista3;

import java.util.Scanner;

public class DoisNumero {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede o primeiro numero
        System.out.print("Digite o primeiro numero: ");
        
        // aqui le o primeiro numero e guarda na variavel num1
        int num1 = sc.nextInt();
        
        // aqui pede o segundo numero
        System.out.print("Digite o segundo numero: ");
        
        // aqui le o segundo numero e guarda na variavel num2
        int num2 = sc.nextInt();
        
        // aqui compara os dois numeros pra ver qual e maior ou se sao iguais
        if (num1 > num2) {
            // aqui mostra o primeiro como maior
            System.out.println("O maior numero é: " + num1);
        } else if (num2 > num1) {
            // aqui mostra o segundo como maior
            System.out.println("O maior numero é: " + num2);
        } else {
            // aqui entra se os dois forem iguais
            System.out.println("Os dois numeros sao iguais.");
        }
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}