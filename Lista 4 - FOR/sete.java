package Lista4;

import java.util.Scanner;

public class sete {

    public static void main(String[] args) {

        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui pede o numero inicial
        System.out.print("Número inicial: ");
        
        // aqui le o numero inicial e guarda na variavel inicio
        int inicio = sc.nextInt();

        // aqui pede o numero final
        System.out.print("Número final: ");
        
        // aqui le o numero final e guarda na variavel fim
        int fim = sc.nextInt();

        // aqui pede o incremento
        System.out.print("Incremento: ");
        
        // aqui le o incremento e guarda na variavel inc
        int inc = sc.nextInt();

        // aqui faz o loop indo do inicio ate o fim pulando de acordo com o incremento
        for (int i = inicio; i <= fim; i = i + inc) {
            
            // aqui mostra o valor atual do contador
            System.out.println(i);
        }

        // aqui o programa termina poderia fechar o scanner tambem
    }
}