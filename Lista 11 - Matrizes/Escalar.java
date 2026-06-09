package lista11;

import java.util.Scanner;

public class Escalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Entrada da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Entrada do escalar
        System.out.print("Digite o número escalar: ");
        int escalar = sc.nextInt();

        // Multiplicação
        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int resultado = matriz[i][j] * escalar;
                System.out.print(resultado + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}