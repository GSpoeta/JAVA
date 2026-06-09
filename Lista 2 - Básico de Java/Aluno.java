package Lista2;

import java.util.Scanner;

public class Aluno {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner scanner = new Scanner(System.in);

        // aqui pede a nota do aluno
        System.out.print("Digite a nota do aluno: ");
        
        // aqui le a nota digitada e guarda na variavel nota
        double nota = scanner.nextDouble();

        // aqui pede a frequencia em porcentagem
        System.out.print("Digite a frequência em (%): ");
        
        // aqui le a frequencia digitada e guarda na variavel frequencia
        double frequencia = scanner.nextDouble();

        // aqui verifica se o aluno foi aprovado
        // precisa ter nota maior ou igual a 60 e frequencia maior ou igual a 75
        boolean aprovado = (nota >= 60) && (frequencia >= 75);

        // aqui entra na condicao se aprovado for verdadeiro
        if (aprovado) {
            // aqui mostra mensagem de aprovado
            System.out.println("Aluno aprovado. (graças a deus n vou ver mais esse capet@");
        } else {
            // aqui entra se nao passou nas condicoes
            // aqui mostra mensagem de reprovado
            System.out.println("Aluno reprovado. (fdp vai ta aq ano q vem dnv)");
        }

        // aqui fecha o scanner depois de usar
        scanner.close();
    }
}
