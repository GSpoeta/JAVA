package lista11p2;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int pares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um valor: ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + pares);

        sc.close();
    }
}