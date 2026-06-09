package Lista10p2;

import java.util.HashSet;
import java.util.Scanner;

public class DicionarioPalavras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> palavras = new HashSet<>();

        String palavra;

        do {
            System.out.print("Digite uma palavra (fim para sair): ");
            palavra = sc.nextLine();

            // Adiciona apenas se não for fim
            if (!palavra.equalsIgnoreCase("fim")) {
                palavras.add(palavra);
            }

        } while (!palavra.equalsIgnoreCase("fim"));

        // Mostra total de palavras únicas
        System.out.println("Total de palavras unicas: " + palavras.size());
    }
}