package Lista3;

import java.util.Scanner;

public class Substituir {

    public static void main(String[] args) {

        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner ler = new Scanner(System.in);

        // aqui pede uma frase pro usuario
        System.out.print("Digite uma frase: ");
        
        // aqui le a frase digitada e guarda na variavel frase
        String frase = ler.nextLine();

        // aqui substitui todas as ocorrencias de java por programacao ignorando maiusculo e minusculo
        frase = frase.replaceAll("(?i)java", "Programação");

        // aqui mostra a nova frase ja alterada
        System.out.println("Nova frase: " + frase);
        
        // aqui pergunta se o usuario tem certeza
        System.out.print("Certeza? : ");
        
        // aqui le a resposta e deixa tudo em minusculo e sem espacos extras
        String resposta = ler.nextLine().trim().toLowerCase();

        // aqui verifica a resposta do usuario
        if (resposta.equals("sim")) {
            // aqui entra se a resposta for sim
            System.out.println("Bela escolha, você irá programar em Delphi pelas próximas 24 horas!");
            
        } else if (resposta.equals("não") || resposta.equals("nao")) {
            // aqui entra se a resposta for nao
            System.out.println("Então por que você está em uma entrevista de programadores?");
            
        } else {
            // aqui entra se a resposta for invalida
            System.out.println("Resposta inválida! Digite 'sim' ou 'não'.");
        }

        // aqui o programa termina poderia fechar o scanner tambem
    }
}