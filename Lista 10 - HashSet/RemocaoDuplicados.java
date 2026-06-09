package Lista10p2;

import java.util.HashSet;
import java.util.Scanner;

public class RemocaoDuplicados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pergunta quantos números o usuário quer digitar
        System.out.print("Quantos números deseja digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        // Lê os números do usuário
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        // HashSet remove duplicados automaticamente
        HashSet<Integer> unicos = new HashSet<>();

        for (int num : numeros) {
            unicos.add(num);
        }

        // Mostra apenas números únicos
        System.out.println("Números únicos: " + unicos);
    }
}