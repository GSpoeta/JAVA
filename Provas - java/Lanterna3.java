package Prova;

import java.util.Scanner;

public class Lanterna3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bateria = 100;

        while (bateria > 0) {

            System.out.println("\nBateria atual: " + bateria + "%");
            System.out.println("1. Caminhar (-20%)");
            System.out.println("2. Trocar pilhas (+40%)");
            System.out.print("Escolha: ");

            int opcao = sc.nextInt();

            if (opcao == 1) {

                bateria -= 20;
                System.out.println("Você caminhou no corredor.");

            } else if (opcao == 2) {

                bateria += 40;

                // Limitador máximo de bateria
                if (bateria > 100) {
                    bateria = 100;
                }

                System.out.println("Pilhas trocadas!");

            } else {

                bateria -= 5;
                System.out.println("Opção inválida! Você perdeu 5% da bateria.");
            }

            // Evita valores negativos
            if (bateria < 0) {
                bateria = 0;
            }
        }

        System.out.println("\nGame Over! A bateria acabou.");

       
    }
}

//Questão 3: A Lanterna no Escuro
//Cenário: O jogador está em um corredor escuro e sua única fonte de luz é uma lanterna que começa com
//100% de bateria. Gerenciar recursos é vital.
//A Tarefa: Simule o gasto da bateria mostrando as opções "1. Caminhar" (-20%) ou "2. Trocar pilhas"
//(+40%, máximo 100%). Se digitar opção inválida, perde 5%. O jogo encerra com "Game Over" quando a
//bateria chegar a zero.
//Estruturas Obrigatórias:
//Scanner para a tomada de decisão.
//Laço de repetição while atrelado à carga da bateria.
//Estrutura condicional if-else com limitador matemático (não passar de 100%).
