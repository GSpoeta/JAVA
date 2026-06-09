package Lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
   
 
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria um array para guardar 4 notas
        double[] notas = new double[4];
        
        // aqui variavel para somar todas as notas
        double soma = 0;

        // aqui loop para ler as 4 notas
        for (int i = 0; i < 4; i++) {
            
            // aqui pede a nota da posicao atual
            System.out.print("Nota do tri. " + (i + 1) + ": ");
            
            // aqui guarda a nota no array
            notas[i] = sc.nextDouble();
            
            // aqui soma a nota digitada
            soma += notas[i];
        }

        // aqui calcula e mostra a media das notas
        System.out.println("Média: " + (soma / 4));
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}