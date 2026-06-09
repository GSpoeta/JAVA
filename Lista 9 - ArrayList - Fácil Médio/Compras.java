package Lista9;

import java.util.ArrayList;

public class Compras {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Leite");

        System.out.println("Lista de compras:");
        for (String item : lista) {
            System.out.println(item);
        }
    }
}
