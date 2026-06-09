package Lista9;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota: ");
            notas.add(sc.nextDouble());
        }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }

        double media = soma / notas.size();

        System.out.println("Média: " + media);

        sc.close();
    }
}