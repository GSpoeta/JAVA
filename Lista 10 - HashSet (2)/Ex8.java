package Lista10p1;

import java.util.HashSet;

public class Ex8 {
    public static void main(String[] args) {

        // Cria um HashSet de números
        HashSet<Integer> numeros = new HashSet<>();

        // Adiciona números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // Remove números pares
        numeros.removeIf(n -> n % 2 == 0);

        // Exibe resultado
        System.out.println("Números restantes (ímpares): " + numeros);
    }
}
