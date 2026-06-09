package Lista10p2;

import java.util.HashSet;
import java.util.Scanner;

public class FiltroNumerosPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        // Lê 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        HashSet<Integer> pares = new HashSet<>();

        // Guarda apenas pares
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        System.out.println("Pares sem repetição: " + pares);
    }
}