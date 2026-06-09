package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ParOuImpar {
    
    // Método responsável por verificar se o número é par ou ímpar
    public static void verificar(int numero){
        
        // O operador % retorna o resto da divisão
        // Se o resto da divisão por 2 for 0, o número é par
        if(numero % 2 == 0){
            System.out.println("Par");
        } else {
            // Caso contrário, o número é ímpar
            System.out.println("Impar");
        }
    }

    public static void main(String[] args){
        
        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um numero: ");
        
        // Lê o número digitado
        int num = sc.nextInt();

        // Chama o método verificar
        verificar(num);
    }
}