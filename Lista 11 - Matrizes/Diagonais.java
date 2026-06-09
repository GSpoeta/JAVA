package lista11;

import java.util.Scanner;

public class Diagonais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Entrada de dados
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        // Cálculo das diagonais
        for (int i = 0; i < 3; i++) {
            somaPrincipal += matriz[i][i];           // diagonal principal
            somaSecundaria += matriz[i][2 - i];      // diagonal secundária
        }

        // Saída
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        sc.close();
    }
}