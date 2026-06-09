package Lista3;

import java.util.Scanner;

public class PalavraInvertida {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede uma palavra pro usuario
        System.out.print("Digite uma palavra: ");
        
        // aqui le a palavra digitada e guarda na variavel palavra
        String palavra = sc.nextLine();
        
        // aqui cria uma string vazia que vai guardar a palavra invertida
        String invertida = "";
        
        // aqui percorre a palavra de tras pra frente
        for (int i = palavra.length() - 1; i >= 0; i--) {
            // aqui vai adicionando cada letra na ordem inversa
            invertida += palavra.charAt(i);
        }
        
        // aqui mostra a palavra ja invertida
        System.out.println("Palavra invertida: " + invertida);
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}