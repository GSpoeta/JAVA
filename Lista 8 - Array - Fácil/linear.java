package Lista8FA;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 5, 8, 3, 15, 2};

        System.out.print("Digite o numero que deseja buscar: ");
        int busca = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busca) {
                System.out.println("Encontrado no índice: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

    }
}