package Lista9;

import java.util.ArrayList;

public class Cor {
    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<>();

        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");

        boolean existe = cores.contains("Amarelo");

        System.out.println("Contém 'Amarelo'? " + existe);
    }
}