package Lista1;

import java.util.Scanner;

public class cupicha {
    public static void main(String[] args) {
        // aqui cria o scanner pra pegar o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui pergunta quantos dias a pessoa trabalhou
        System.out.print("Quantos dias trabalhou? ");
        
        // aqui le o numero de dias e guarda na variavel dias
        int dias = sc.nextInt();

        // aqui calcula o salario considerando 8 horas por dia e 25 por hora
        double salario = dias * 8 * 25;

        // aqui mostra o salario formatado com duas casas decimais
        System.out.printf("Salário total: R$ %.2f%n", salario);

        // aqui poderia fechar o scanner mas o codigo termina logo depois
    }
}