package Lista9;

import java.util.ArrayList;

public class Pares {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (int n : numeros) {
            if (n % 2 == 0) {
                pares.add(n);
            }
        }

        System.out.println("Números pares: " + pares);
    }
}