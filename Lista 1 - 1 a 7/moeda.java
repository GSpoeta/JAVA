package Lista1;

import java.util.Scanner;

public class moeda {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui pergunta quantos reais a pessoa tem
        System.out.print("Quantos reais você tem? ");
        
        // aqui le o valor digitado e guarda na variavel reais
        double reais = sc.nextDouble();

        // aqui faz a conversao de reais para dolar usando a cotacao 5.45
        double dolar = reais / 5.45;

        // aqui mostra quanto em dolar a pessoa pode comprar com duas casas decimais
        System.out.printf("Você pode comprar: US$ %.2f%n", dolar);

        // aqui o programa termina poderia fechar o scanner tambem
    }
}