package Lista6;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui variavel da nota e soma das notas
        double nota, soma = 0;
        
        // aqui contador das notas
        int i = 1;

        // aqui repete ate pegar 4 notas validas
        do {
            
            // aqui valida a nota enquanto ela nao estiver entre 0 e 10
            do {
                // aqui pede a nota atual
                System.out.print("Digite a nota " + i + " (0 a 10): ");
                
                // aqui le a nota digitada
                nota = sc.nextDouble();
                
            } while (nota < 0 || nota > 10);

            // aqui soma a nota valida
            soma += nota;
            
            // aqui passa para a proxima nota
            i++;
            
        } while (i <= 4);

        // aqui calcula e mostra a media das 4 notas
        System.out.println("Média: " + (soma / 4));

        // aqui o programa termina poderia fechar o scanner tambem
    }
}