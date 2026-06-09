package lista7;

import java.util.Scanner;

public class dia {
    public static void main(String[] args) {

        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui pede um numero de 1 a 7 pro usuario
        System.out.print("Digite um numero de 1 a 7: ");
        
        // aqui le o numero digitado e guarda na variavel dia
        int dia = sc.nextInt();

        // aqui usa switch pra identificar qual dia da semana e
        switch (dia) {
            
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terca"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sabado"); break;
            
            // aqui entra se o numero nao for de 1 a 7
            default: System.out.println("Número inválido");
        }

        // aqui o programa termina poderia fechar o scanner tambem
    }
}