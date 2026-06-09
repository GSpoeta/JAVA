package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class DobrarAte100 {

    // Método responsável por dobrar o número até ele ultrapassar 100
    public static void dobrar(int numero){
        
        // Enquanto o número for menor ou igual a 100
        while(numero <= 100){
            
            // Exibe o valor atual
            System.out.println(numero);
            
            // Multiplica o número por 2
            numero *= 2;
        }
    }

    public static void main(String[] args){
        
        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um numero: ");
        
        // Lê o número digitado
        int num = sc.nextInt();

        // Chama o método dobrar
        dobrar(num);
    }
}