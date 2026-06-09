package Lista10p1;

import java.util.HashSet;

public class Ex6 {
    public static void main(String[] args) {

        // Cria um HashSet de cidades
        HashSet<String> cidades = new HashSet<>();

        // Adiciona cidades
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Curitiba");

        // Remove a cidade "São Paulo"
        cidades.remove("São Paulo");

        // Mostra o resultado final
        System.out.println("Cidades restantes: " + cidades);
    }
}
