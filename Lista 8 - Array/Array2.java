package Lista8;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui pede uma palavra pro usuario
        System.out.print("Digite uma palavra: ");
        
        // aqui le a palavra digitada
        String palavra = sc.nextLine();

        // aqui transforma a palavra em um array de caracteres
        char[] letras = palavra.toCharArray();

        // aqui percorre o array de tras pra frente pra inverter a palavra
        for (int i = letras.length - 1; i >= 0; i--) {
                        
            // aqui imprime cada letra invertida
            System.out.print(letras[i]); 
            
            // aqui pula linha (isso faz quebrar linha a cada letra)
            System.out.println("\n");
        }
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}