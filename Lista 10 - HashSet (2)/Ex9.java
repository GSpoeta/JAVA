package Lista10p1;

import java.util.HashSet;
import java.util.ArrayList;

public class Ex9 {
    public static void main(String[] args) {

        // Cria um HashSet de países
        HashSet<String> paises = new HashSet<>();

        // Adiciona países
        paises.add("Brasil");
        paises.add("Argentina");
        paises.add("Chile");

        // Cria uma lista para comparação
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Brasil");
        lista.add("Chile");

        // Verifica se o HashSet contém todos os elementos da lista
        if (paises.containsAll(lista)) {
            System.out.println("O conjunto contém todos os elementos da lista.");
        } else {
            System.out.println("O conjunto NÃO contém todos os elementos.");
        }
    }
}