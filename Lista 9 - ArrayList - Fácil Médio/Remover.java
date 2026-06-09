package Lista9;

import java.util.ArrayList;
import java.util.Scanner;

public class Remover {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.print("Digite um número para remover: ");
        int num = sc.nextInt();

        numeros.remove(Integer.valueOf(num));

        System.out.println("Novo tamanho da lista: " + numeros.size());

        sc.close();
    }
}