package Lista10p1;

import java.util.HashSet;

public class Ex4 {
    public static void main(String[] args) {

        // Cria um HashSet de cidades
        HashSet<String> cidades = new HashSet<>();

        // Adiciona algumas cidades
        cidades.add("Passo Fundo");
        cidades.add("Porto Alegre");

        // Verifica se o conjunto está vazio
        if (cidades.isEmpty()) {
            System.out.println("O conjunto está vazio.");
        } else {
            System.out.println("O conjunto NÃO está vazio.");
        }
    }
}