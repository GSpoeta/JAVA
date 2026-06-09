package Prova;

import java.util.Scanner;

public class Catalogo5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] filmes = new String[3][3];

        // Cadastro
        for (int i = 0; i < filmes.length; i++) {

            System.out.println("\nCadastro do filme " + (i + 1));

            System.out.print("Título: ");
            filmes[i][0] = sc.nextLine();

            System.out.print("Gênero: ");
            filmes[i][1] = sc.nextLine();

            System.out.print("Nota: ");
            filmes[i][2] = sc.nextLine();
        }

        // Exibição
        System.out.println("\n=== RELATÓRIO DOS FILMES ===");

        for (int i = 0; i < filmes.length; i++) {

            System.out.println("\nFilme " + (i + 1));
            System.out.println("Título: " + filmes[i][0]);
            System.out.println("Gênero: " + filmes[i][1]);
            System.out.println("Nota: " + filmes[i][2]);
        }

    }
}



//Questão 5: Claquete - Catálogo de Filmes
//Cenário: Um crítico de cinema precisa catalogar seus três filmes de suspense favoritos, guardando o
//título, o gênero e a nota.
//A Tarefa: Crie um programa que faça o cadastro de 3 filmes, perguntando Título, Gênero e Nota (estrelas)
//de cada um. Ao final, imprima um relatório formatado com todos os dados.
//Estruturas Obrigatórias:
//Uma Matriz (array bidimensional) de Strings (3x3).
//Scanner para capturar os textos.
//Dois laços for clássicos (um para ler, outro para exibir)