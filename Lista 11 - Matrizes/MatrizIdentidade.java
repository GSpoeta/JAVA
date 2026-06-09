package lista11;

import java.util.Scanner;

public class MatrizIdentidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        boolean identidade = true; // assume que é identidade

        System.out.println("Digite a matriz 3x3:");

        // entrada
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // verificação
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // diagonal principal deve ser 1
                if (i == j && matriz[i][j] != 1) {
                    identidade = false;
                }

                // fora da diagonal deve ser 0
                if (i != j && matriz[i][j] != 0) {
                    identidade = false;
                }
            }
        }

        if (identidade) {
            System.out.println("É uma matriz identidade!");
        } else {
            System.out.println("Não é matriz identidade.");
        }
    }
}