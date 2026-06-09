package Lista8;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria um array com 6 numeros
        int[] numeros = new int[6];

        // aqui loop para preencher o array
        for (int i = 0; i < 6; i++) {
            
            // aqui pede um numero pro usuario
            System.out.print("Número: ");
            
            // aqui armazena o numero no array
            numeros[i] = sc.nextInt();
        }

        // aqui pede o numero alvo que sera procurado
        System.out.print("Alvo: ");
        int alvo = sc.nextInt();

        // aqui contador de quantas vezes o alvo aparece
        int contador = 0;

        // aqui percorre o array contando ocorrencias do alvo
        for (int n : numeros) {
            if (n == alvo) {
                contador++;
            }
        }

        // aqui mostra a frequencia do numero no array
        System.out.println("Frequência: " + contador);

        // aqui o programa termina poderia fechar o scanner tambem
    }
}