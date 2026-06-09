package Lista8;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria um array pra guardar 3 valores
        double[] valores = new double[3];
        
        // aqui variavel que vai somar todos os valores
        double soma = 0;

        // aqui loop pra ler os 3 valores
        for (int i = 0; i < 3; i++) {
            
            // aqui pede um valor pro usuario
            System.out.print("Valor: ");
            
            // aqui guarda o valor no array
            valores[i] = sc.nextDouble();
            
            // aqui soma o valor digitado
            soma += valores[i];
        }

        // aqui calcula e mostra a media dos valores
        System.out.println("Média: " + (soma / 3));

        // aqui o programa termina poderia fechar o scanner tambem
    }
}