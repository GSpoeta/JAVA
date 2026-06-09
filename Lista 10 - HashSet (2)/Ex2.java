package Lista10p1;

import java.util.HashSet;

public class Ex2 {
    public static void main(String[] args) {

        // Cria um HashSet de strings (frutas)
        HashSet<String> frutas = new HashSet<>();

        // Adiciona algumas frutas
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Remove uma fruta específica
        frutas.remove("Banana");

        // Exibe o conjunto final
        System.out.println("Frutas restantes: " + frutas);
    }
}
