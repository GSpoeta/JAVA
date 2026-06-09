package Lista10p2;

import java.util.HashSet;
import java.util.Scanner;

public class AlertaRepeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numeros = new HashSet<>();

        while (true) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            // Se já existe, encerra
            if (numeros.contains(num)) {
                System.out.println("Número repetido! Encerrando...");
                break;
            }

            numeros.add(num);
        }
    }
}