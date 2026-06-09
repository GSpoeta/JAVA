package Lista8;

import java.util.Scanner;
import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria um array com 4 numeros
        int[] numeros = new int[4];

        // aqui loop para preencher o array
        for (int i = 0; i < 4; i++) {
            
            // aqui pede um numero pro usuario
            System.out.print("Número: ");
            
            // aqui armazena o numero no array
            numeros[i] = sc.nextInt();

            // aqui verifica se o numero e negativo
            if (numeros[i] < 0) {
                // se for negativo, substitui por 0
                numeros[i] = 0;
            }
        }

        // aqui mostra o array final
        System.out.println(Arrays.toString(numeros));

        // aqui o programa termina poderia fechar o scanner tambem
    }
}