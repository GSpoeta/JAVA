package Lista9;

import java.util.ArrayList;
import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Ana");
        alunos.add("Carlos");
        alunos.add("João");

        System.out.print("Digite o nome para buscar: ");
        String nome = sc.nextLine();

        if (alunos.contains(nome)) {
            System.out.println("Encontrado na posição: " + alunos.indexOf(nome));
        } else {
            System.out.println("Aluno não encontrado.");
        }

        sc.close();
    }
}