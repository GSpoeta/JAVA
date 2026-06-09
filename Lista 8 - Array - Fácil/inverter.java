package Lista8FA;

import java.util.Scanner;

public class inverter {
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

        int[] invertido = new int[numeros.length];

        // invertendo o array
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }

        // mostrando resultado
        System.out.print("Array invertido: ");
        for (int num : invertido) {
            System.out.print(num + " ");
        }


    }
}