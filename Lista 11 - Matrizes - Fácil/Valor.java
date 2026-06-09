package lista11p2;

import java.util.Scanner;

public class Valor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][2];

        int maior;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        maior = matriz[0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("Maior valor: " + maior);

        sc.close();
    }
}