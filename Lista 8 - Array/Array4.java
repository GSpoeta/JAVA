package Lista8;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria um array para guardar 5 numeros
        int[] numeros = new int[5];

        // aqui loop para preencher o array com 5 numeros
        for (int i = 0; i < 5; i++) {
            
            // aqui pede um numero pro usuario
            System.out.print("Número: ");
            
            // aqui armazena o numero na posicao i do array
            numeros[i] = sc.nextInt();
        }

        // aqui pede o numero que vai ser procurado no array
        System.out.print("Digite o alvo: ");
        int alvo = sc.nextInt();

        // aqui variavel que indica se o numero foi encontrado
        boolean encontrado = false;

        // aqui percorre todos os numeros do array
        for (int n : numeros) {
            
            // aqui verifica se o numero atual e igual ao alvo
            if (n == alvo) {
                encontrado = true;
                break;
            }
        }

        // aqui mostra se encontrou ou nao o numero
        System.out.println(encontrado);

        // aqui o programa termina poderia fechar o scanner tambem
    }
}