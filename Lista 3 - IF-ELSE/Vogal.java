package Lista3;

import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede uma palavra pro usuario
        System.out.print("Digite uma palavra: ");
        
        // aqui le a palavra e transforma tudo em minusculo pra facilitar a comparacao
        String palavra = sc.nextLine().toLowerCase();
        
        // aqui cria uma variavel que vai indicar se tem vogal ou nao
        boolean temVogal = false;
        
        // aqui percorre cada letra da palavra
        for (int i = 0; i < palavra.length(); i++) {
            
            // aqui pega cada caractere da palavra
            char letra = palavra.charAt(i);
            
            // aqui verifica se a letra e uma vogal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                // aqui marca que encontrou vogal
                temVogal = true;
                // aqui para o loop porque ja achou uma vogal
                break;
            }
        }
        
        // aqui verifica se encontrou vogal
        if (temVogal) {
            // aqui mostra que tem pelo menos uma vogal
            System.out.println("A palavra contém pelo menos uma vogal.");
        } else {
            // aqui mostra que nao tem vogais
            System.out.println("A palavra nao contém vogais.");
        }
     
        // aqui o programa termina poderia fechar o scanner tambem
    }
}