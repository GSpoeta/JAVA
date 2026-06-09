package lista7;

import java.util.Scanner;

public class repetiçao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro numero: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    double n2 = sc.nextDouble();
                    System.out.println("Resultado: " + (n1 + n2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro numero: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado: " + (n1 - n2));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    System.out.println("Resultado: " + (n1 * n2));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    n2 = sc.nextDouble();

                    if (n2 != 0) {
                        System.out.println("Resultado: " + (n1 / n2));
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 5);

        sc.close();
    }
}