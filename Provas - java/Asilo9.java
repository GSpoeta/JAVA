package Prova;


import java.util.Scanner;

public class Asilo9 {


   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Mochila
        String[] mochila = new String[3];

        System.out.println("=== ITENS DA MOCHILA ===");

        for (int i = 0; i < mochila.length; i++) {

            System.out.print("Digite o item " + (i + 1) + ": ");
            mochila[i] = sc.nextLine();
            
        }

        // Mapa do quarto
        int[][] mapa = {
            {1, 0, 0},
            {0, 1, 1},
            {0, 0, 1}
        };

        int opcao;

        do {

            System.out.println("\n=== MENU ===");
            System.out.println("1. Ver mochila");
            System.out.println("2. Inspecionar quarto");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\nItens da mochila:");

                    for (String item : mochila) {
                        System.out.println("- " + item);
                    }

                    break;

                case 2:

                    int municoes = 0;

                    // Varredura da matriz
                    for (int i = 0; i < mapa.length; i++) {

                        for (int j = 0; j < mapa[i].length; j++) {

                            if (mapa[i][j] == 1) {

                                municoes++;

                                
                                mapa[i][j] = 0;
                            }
                        }
                    }

                    System.out.println("Você encontrou " + municoes + " caixas de munição!");
                       
                    break;

                case 0:

                    System.out.println("Saindo...");
                    System.out.println("\nOque é aquele homem com um cutelo! Sera um... assaino em serie?...  ");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

    }
}
    

//Questão 9: Rastreador no Asilo
//Cenário: O jogador está em um asilo escuro com uma mochila de bolsos limitados. Ele precisa encontrar
//caixas de munição no quarto.
//A Tarefa: Peça ao jogador para nomear os itens básicos que trouxe na mochila. Depois, libere um menu
//de ações. Ao escolher "Inspecionar", o sistema varre um mapa escondido (onde 1 é munição e 0 é vazio),
//recolhe os itens, limpa o espaço e informa quantas caixas encontrou.
//Estruturas Obrigatórias:
//Um Array fixo alimentado por for (mochila inicial).
//Uma Matriz numérica estática (mapa do quarto).
//Laços for aninhados para varrer a matriz.
//Menu principal usando do-while e switch-case
    
//que caralho :_: