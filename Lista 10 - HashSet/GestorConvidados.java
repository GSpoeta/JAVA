package Lista10p2;

import java.util.HashSet;
import java.util.Scanner;

public class GestorConvidados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> convidados = new HashSet<>();

        int op;

        do {
            System.out.println("\n1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine(); // limpa buffer

            switch (op) {
                case 1:
                    // Adiciona convidado
                    System.out.print("Nome: ");
                    convidados.add(sc.nextLine());
                    break;

                case 2:
                    // Remove convidado
                    System.out.print("Nome: ");
                    convidados.remove(sc.nextLine());
                    break;

                case 3:
                    // Lista convidados
                    System.out.println("Convidados: " + convidados);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 0);
    }
}