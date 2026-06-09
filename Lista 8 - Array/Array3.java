package Lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria um array para armazenar 5 numeros
        int[] numeros = new int[5];

        // aqui loop para preencher o array com 5 numeros
        for (int i = 0; i < 5; i++) {
            
            // aqui pede um numero pro usuario
            System.out.print("Número: ");
            
            // aqui guarda o numero na posicao i do array
            numeros[i] = sc.nextInt();
        }

        // aqui inicia a variavel maior com o primeiro elemento do array
        int maior = numeros[0];

        // aqui percorre todos os numeros do array
        for (int n : numeros) {
            
            // aqui verifica se o numero atual e maior que o maior atual
            if (n > maior) {
                maior = n;
            }
        }

        // aqui mostra o maior numero encontrado
        System.out.println("Maior: " + maior);
        
        // aqui fecha o scanner
        sc.close();
    }
}