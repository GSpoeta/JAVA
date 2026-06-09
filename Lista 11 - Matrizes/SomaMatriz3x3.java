package lista11;

import java.util.Scanner;

public class SomaMatriz3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3]; // cria matriz 3x3
        int soma = 0; // variável para armazenar a soma

        System.out.println("Digite os valores da matriz 3x3:");

        // entrada de dados
        for (int i = 0; i < 3; i++) { // percorre linhas
            for (int j = 0; j < 3; j++) { // percorre colunas
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // soma dos elementos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j]; // soma cada valor
            }
        }

        System.out.println("Soma total: " + soma);
    }
}