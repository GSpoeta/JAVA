package Lista9;

import java.util.ArrayList;

public class Cidades {
    public static void main(String[] args) {

        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Porto Alegre");
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Curitiba");
        cidades.add("Florianópolis");

        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}