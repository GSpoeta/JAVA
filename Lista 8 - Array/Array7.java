package Lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria o array original com 4 numeros
        int[] original = new int[4];
        
        // aqui cria o array copia que vai armazenar os valores dobrados
        int[] copia = new int[4];

        // aqui loop pra ler os numeros e ja gerar a copia dobrada
        for (int i = 0; i < 4; i++) {
            
            // aqui pede um numero pro usuario
            System.out.print("Número: ");
            
            // aqui guarda o numero no array original
            original[i] = sc.nextInt();
            
            // aqui coloca no array copia o valor dobrado
            copia[i] = original[i] * 2;
        }

        // aqui mostra o array com os valores dobrados
        System.out.println(Arrays.toString(copia));

        // aqui o programa termina poderia fechar o scanner tambem
    }
}