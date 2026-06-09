package Lista8;

import java.util.*;

public class array10 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria o array A com 3 numeros
        int[] a = new int[3];
        
        // aqui cria o array B com 3 numeros
        int[] b = new int[3];

        // aqui preenche o array A
        System.out.println("Array A:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número: ");
            a[i] = sc.nextInt();
        }

        // aqui preenche o array B
        System.out.println("Array B:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número: ");
            b[i] = sc.nextInt();
        }

        // aqui cria o array C com tamanho dos dois arrays juntos
        int[] c = new int[a.length + b.length];

        // aqui copia o array A para o inicio de C
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // aqui copia o array B para depois do A em C
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        // aqui mostra o array concatenado
        System.out.println(Arrays.toString(c));

        // aqui o programa termina poderia fechar o scanner tambem
    }
}