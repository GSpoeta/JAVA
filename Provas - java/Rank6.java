package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Rank6 {

    public static void Lista(ArrayList<String> animes) {

        System.out.println("\n=== LISTA DE ANIMES ===");

        for (String anime : animes) {
            System.out.println("- " + anime);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaAnimes = new ArrayList<>();

        String anime = "";

        while (!anime.equalsIgnoreCase("fim")) {

            System.out.print("Digite um anime (ou 'fim' para encerrar): ");
            anime = sc.nextLine();

            if (!anime.equalsIgnoreCase("fim")) {
                listaAnimes.add(anime);
            }
        }

        Lista(listaAnimes);

       
    }
}



//Questão 6: MyAnimeRank
//Cenário: Um fã de cultura pop quer listar os animes que assistiu, mas não sabe exatamente quantos
//foram.
//A Tarefa: Peça ao usuário para digitar nomes de animes até que ele digite a palavra "fim" (independente
//de maiúsculas/minúsculas). Após isso, envie a lista preenchida para um método separado que imprimirá
//tudo na tela.
//Estruturas Obrigatórias:
//Um ArrayList dinâmico de Strings.
//Laço while para a captura contínua.
//Um Método que receba a lista por parâmetro e use um for-each.