package Lista10p2;

import java.util.HashSet;
import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usuários já cadastrados
        HashSet<String> usuarios = new HashSet<>();
        usuarios.add("admin");
        usuarios.add("joao");
        usuarios.add("maria");

        // Pede novo usuário
        System.out.print("Digite um nome de usuário: ");
        String novo = sc.nextLine();

        // Verifica se já existe
        if (usuarios.contains(novo)) {
            System.out.println("Usuário já existe!");
        } else {
            System.out.println("Usuário disponível!");
        }
    }
}