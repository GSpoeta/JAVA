package Lista4;

import java.util.Scanner;

public class cinco {

    public static void main(String[] args) {

        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria uma variavel pra somar todos os numeros
        double soma = 0;

        // aqui repete 5 vezes pra pedir 5 numeros
        for (int i = 1; i <= 5; i++) {

            // aqui pede um numero pro usuario
            System.out.print("Digite um número: ");
            
            // aqui le o numero digitado e guarda na variavel num
            double num = sc.nextDouble();

            // aqui vai somando os numeros digitados
            soma = soma + num;
        }

        // aqui calcula a media dividindo a soma por 5
        double media = soma / 5;

        // aqui mostra a media final
        System.out.println("Média = " + media);

        // aqui o programa termina poderia fechar o scanner tambem
    }
}