
package Lista10p1;

import java.util.HashSet;
import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {

        // Cria um HashSet de inteiros
        HashSet<Integer> numeros = new HashSet<>();

        // Gerador de números aleatórios
        Random random = new Random();

        // Adiciona 10 números aleatórios (0 a 99)
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100));
        }

        // Mostra o tamanho do conjunto (sem repetidos)
        System.out.println("Tamanho do conjunto: " + numeros.size());
        System.out.println("Elementos: " + numeros);
    }
}

