
package Lista10p1;

import java.util.HashSet;
import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {

        // Cria um HashSet de cores
        HashSet<String> cores = new HashSet<>();

        // Adiciona cores
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");

        // Converte o HashSet para ArrayList
        ArrayList<String> lista = new ArrayList<>(cores);

        // Exibe os elementos da lista
        System.out.println("Lista de cores: " + lista);
    }
}
