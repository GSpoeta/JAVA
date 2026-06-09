package Lista8FA;

import java.util.Scanner;

public class pares {
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

        int pares = 0, impares = 0;

        // contagem
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}

      
    
