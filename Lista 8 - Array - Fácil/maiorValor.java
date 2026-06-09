package Lista8FA;

import java.util.Scanner;

public class maiorValor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar? ");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho];

        // entrada dos numeros
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];

        // encontrar maior
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("Maior valor: " + maior);

    }
}