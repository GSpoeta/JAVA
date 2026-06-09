package Lista8FA;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar? ");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho];

        // entrada
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int soma = 0;

        // soma
        for (int num : numeros) {
            soma += num;
        }

        double media = (double) soma / numeros.length;
        System.out.println("Média: " + media);

        System.out.print("Acima da média: ");
        for (int num : numeros) {
            if (num > media) {
                System.out.print(num + " ");
            }
        }

    }
}