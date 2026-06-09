package Lista10p1;

import java.util.HashSet;

public class Ex1 {
    public static void main(String[] args) {

        // Cria um HashSet que armazena números inteiros
        HashSet<Integer> numeros = new HashSet<>();

        // Adiciona números de 1 até 10 no conjunto
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // Verifica se o número 5 está dentro do conjunto
        if (numeros.contains(5)) {
            System.out.println("O número 5 está presente.");
        } else {
            System.out.println("O número 5 NÃO está presente.");
        }
    }
}
