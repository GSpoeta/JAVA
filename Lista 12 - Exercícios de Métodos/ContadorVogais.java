package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para ler dados digitados pelo usuário

public class ContadorVogais {

    // Método responsável por contar quantas vogais existem na palavra recebida
    public static void contar(String palavra){
        int contador = 0; // Variável que vai armazenar a quantidade de vogais

        // Laço que percorre cada caractere da palavra
        for(int i = 0; i < palavra.length(); i++){
            
            // Pega a letra na posição i e converte para minúscula
            // Isso garante que letras maiúsculas também sejam contadas
            char letra = Character.toLowerCase(palavra.charAt(i));

            // Verifica se a letra é uma vogal
            switch(letra){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++; // Se for vogal, incrementa o contador
                    break; // Sai do switch
            }
        }

        // Exibe o total de vogais encontradas
        System.out.println("Quantidade de vogais: " + contador);
    }

    public static void main(String[] args){
        
        // Cria o Scanner para ler entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite uma palavra
        System.out.print("Digite uma palavra: ");
        
        // Lê a palavra digitada
        String palavra = sc.nextLine();

        // Chama o método contar passando a palavra digitada
        contar(palavra);
    }
}