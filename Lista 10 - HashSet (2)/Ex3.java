package Lista10p1;

import java.util.HashSet;

public class Ex3 {
    public static void main(String[] args) {

        // Cria um HashSet de inteiros
        HashSet<Integer> numeros = new HashSet<>();

        // Adiciona números de 1 a 5
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }

        // Limpa todo o conjunto
        numeros.clear();

        // Verifica se o conjunto está vazio
        if (numeros.isEmpty()) {
            System.out.println("O conjunto está vazio.");
        } else {
            System.out.println("O conjunto NÃO está vazio.");
        }
    }
}

