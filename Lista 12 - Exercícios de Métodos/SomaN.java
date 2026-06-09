package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class SomaN {

    // Método responsável por somar todos os números de 1 até N
    public static void somar(int n){
        
        // Variável que vai armazenar o resultado da soma
        int soma = 0;

        // Laço que começa em 1 e vai até N
        for(int i = 1; i <= n; i++){
            
            // Adiciona o valor de i na variável soma
            soma += i;
        }

        // Exibe o resultado final
        System.out.println("Soma = " + soma);
    }

    public static void main(String[] args){
        
        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita o valor de N
        System.out.print("Digite N: ");
        
        // Lê o número digitado
        int n = sc.nextInt();

        // Chama o método somar
        somar(n);
    }
}