package Lista8FA;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar? ");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho];

        // entrada dos valores
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int soma = 0;

        // soma dos valores
        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Soma: " + soma);

        
    }
}