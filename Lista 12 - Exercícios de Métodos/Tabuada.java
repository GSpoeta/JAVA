package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Tabuada {

    // Método responsável por calcular e mostrar a tabuada
    public static void calcular(int numero){
        
        // Laço que vai de 1 até 10
        for(int i = 1; i <= 10; i++){
            
            // Exibe a multiplicação e o resultado
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args){
        
        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um numero: ");
        
        // Lê o número digitado
        int num = sc.nextInt();

        // Chama o método calcular
        calcular(num);
    }
}