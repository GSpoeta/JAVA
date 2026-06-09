package Lista8;

import java.util.*;

public class Array5
{
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria um array de strings pra guardar 4 frutas
        String[] frutas = new String[4];

        // aqui loop pra o usuario digitar as 4 frutas
        for (int i = 0; i < 4; i++) {
            
            // aqui pede o nome da fruta
            System.out.print("Fruta: ");
            
            // aqui armazena a fruta no array
            frutas[i] = sc.nextLine();
        }

        // aqui organiza as frutas em ordem alfabetica
        Arrays.sort(frutas);

        // aqui mostra o array ja ordenado
        System.out.println(Arrays.toString(frutas));

        // aqui o programa termina poderia fechar o scanner tambem
    }
}