package folder;

import java.util.Scanner;

public class restaurante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1 - Hamburguer");
        System.out.println("2 - Pizza");
        System.out.println("3 - Refrigerante");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        double valor = 0;

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor do Hamburguer: ");
                valor = sc.nextDouble();
                break;

            case 2:
                System.out.print("Digite o valor da Pizza: ");
                valor = sc.nextDouble();
                break;

            case 3:
                System.out.print("Digite o valor do Refrigerante: ");
                valor = sc.nextDouble();
                break;

            default:
                System.out.println("Opção inválida");
        }

    
        if (valor > 20) {
            double desconto = valor * 0.1;
            double total = valor - desconto;
            System.out.println("Desconto aplicado!");
            System.out.println("Total a pagar: " + total);
        } else {
            System.out.println("Sem desconto.");
            System.out.println("Total a pagar: " + valor);
        }

    }
}