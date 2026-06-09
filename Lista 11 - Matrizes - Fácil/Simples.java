package lista11p2;

import java.util.Scanner;

public class Simples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][2];

        // Entrada
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Valor [0][0]: " + matriz[0][0]);

        sc.close();
    }
}