package lista11p2;

import java.util.Scanner;

public class Segunda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Segunda linha:");
        for (int j = 0; j < 3; j++) {
            System.out.print(matriz[1][j] + " ");
        }

        sc.close();
    }
}