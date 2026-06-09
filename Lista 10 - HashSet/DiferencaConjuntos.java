package Lista10p2;

import java.util.HashSet;
import java.util.Scanner;

public class DiferencaConjuntos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> amigo1 = new HashSet<>();
        HashSet<String> amigo2 = new HashSet<>();

        // Dados do amigo 1
        System.out.println("Passatempos do amigo 1:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite: ");
            amigo1.add(sc.nextLine());
        }

        // Dados do amigo 2
        System.out.println("Passatempos do amigo 2:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite: ");
            amigo2.add(sc.nextLine());
        }

        // Remove do amigo1 o que também está no amigo2
        amigo1.removeAll(amigo2);

        System.out.println("Exclusivos do amigo 1: " + amigo1);
    }
}