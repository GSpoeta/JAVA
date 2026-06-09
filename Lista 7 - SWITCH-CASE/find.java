package lista7;

import java.util.Scanner;

public class find {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia (1 a 7): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de trabalho");
                break;

            default:
                System.out.println("Dia inválido");
        }

    }
}