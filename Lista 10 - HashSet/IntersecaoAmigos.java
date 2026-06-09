package Lista10p2;

import java.util.HashSet;
import java.util.Scanner;

public class IntersecaoAmigos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> listaA = new HashSet<>();
        HashSet<String> listaB = new HashSet<>();

        // Lê lista A
        System.out.println("Lista A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome: ");
            listaA.add(sc.nextLine());
        }

        // Lê lista B
        System.out.println("Lista B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome: ");
            listaB.add(sc.nextLine());
        }

        // Mantém apenas nomes que estão nas duas listas
        listaA.retainAll(listaB);

        System.out.println("Nomes em comum: " + listaA);
    }
}