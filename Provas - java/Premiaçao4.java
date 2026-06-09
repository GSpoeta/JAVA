package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Premiaçao4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> jogos = new HashSet<>();

        int opcao;

        do {

            System.out.println("\n=== HALL DA FAMA ===");
            System.out.println("1. Indicar um jogo");
            System.out.println("2. Ver lista");
            System.out.println("0. Encerrar");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.print("Digite o nome do jogo: ");
                String jogo = sc.nextLine();

                boolean adicionado = jogos.add(jogo);

                if (adicionado) {
                    System.out.println("Jogo adicionado com sucesso!");
                } else {
                    System.out.println("Erro! Esse jogo já foi indicado.");
                }

            } else if (opcao == 2) {

                System.out.println("\nLista de Jogos:");

                for (String jogo : jogos) {
                    System.out.println("- " + jogo);
                }

            } else if (opcao == 0) {

                System.out.println("Programa encerrado.");

            } else {

                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        
    }
}



//Questão 4: Hall da Fama dos Games (Premiação)
//Cenário: O desafio de criar listas de prêmios é garantir que o mesmo jogo não seja indicado duas vezes
//por engano pela comunidade.
//A Tarefa: Crie um menu para: 1. Indicar um Jogo, 2. Ver Lista e 0. Encerrar. O sistema deve verificar
//automaticamente se o título já existe ao tentar cadastrar. Exiba mensagem de sucesso ou erro (jogo
//duplicado).
//Estruturas Obrigatórias:
//Um HashSet de Strings para evitar duplicatas automaticamente.
//Laço do-while para o menu.
//Estrutura condicional if-else avaliando o sucesso da inserção no conjunto.






//Começa no Minegame1 - com um assasino procurando voce numa floresta escura. o nome da floresta se liga como um ester egg
//continua no Cinema8 - A proltona F24 siguinifca Floresta 24 mais nao te contam que é a mesma na qual esta o assino ele sempre esteve la e ele voltara...
//termina no asilo9 - com um Caçador encontrando o assino e o matando... Supostamente.
//premiaçao4 - explicaçao/tuturial 