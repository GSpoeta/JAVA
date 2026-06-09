package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ContagemRegressiva {

    // Método responsável por fazer a contagem regressiva
    public static void contar(int numero){
        
        // Enquanto o número for maior ou igual a zero
        while(numero >= 0){
            
            // Exibe o número atual
            System.out.println(numero);
            
            // Decrementa 1 no valor
            numero--;
        }
    }

    public static void main(String[] args){
        
        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número: ");
        
        // Lê o número digitado
        int num = sc.nextInt();

        // Chama o método contar passando o número informado
        contar(num);
    }
}