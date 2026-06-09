package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Cinema8 {

    static HashSet<String> cpfs = new HashSet<>();

    // Método para popular os CPFs
    public static void cadastrarCPFs() {

        cpfs.add("11111111111");
        cpfs.add("22222222222");
        cpfs.add("33333333333");
    }

    // Método para verificar CPF
    public static boolean verificarCPF(String cpf) {

        return cpfs.contains(cpf);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        cadastrarCPFs();

        System.out.print("Digite o CPF: ");
        String cpfDigitado = sc.nextLine();

        if (verificarCPF(cpfDigitado)) {

            System.out.println("Entrada liberada na área VIP!");
            System.out.println("\nSeu lugar é na poltrona F21");
            System.out.println("\n -Ao sentar no seu lugar vc sente que esta sendo observado mais fica tranquilo quando lembra que esta em um cinema... vip?... ");
            System.out.println("\n -No meio do filme vc se levanta para ir ao banheiro... -\n -E quando voce abrie a porta do sanitario... -\n -BOOOM!!!\n\nO assasino voltou game over!-");
        } else {

            System.out.println("Acesso negado.");
        }

        sc.close();
    }
}

//Questão 8: Catraca Vip - Evento de Cinema
//Cenário: A portaria de um cinema em Tramandaí precisa de um sistema rápido para validar CPFs de
//convidados e liberar ou barrar a entrada na área VIP.
//A Tarefa: Inicie o sistema com CPFs já cadastrados em uma lista restrita. Pergunte o CPF do visitante e
//verifique em tempo real se ele possui autorização.
//Estruturas Obrigatórias:
//Um HashSet global para os CPFs.
//Um Método void para popular a lista com três CPFs no início.
//Um Método com retorno boolean para verificar se o CPF digitado existe no conjunto.

