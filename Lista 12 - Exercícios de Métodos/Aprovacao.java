package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Aprovacao {

    // Método responsável por verificar se o aluno foi aprovado ou reprovado
    public static void verificar(double nota){
        
        // Verifica se a nota é maior ou igual a 7
        if(nota >= 7){
            System.out.println("Aprovado"); // Se for, mostra aprovado
        } else {
            System.out.println("Reprovado"); // Caso contrário, mostra reprovado
        }
    }

    public static void main(String[] args){
        
        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita a nota ao usuário
        System.out.print("Digite a nota: ");
        
        // Lê a nota digitada
        double nota = sc.nextDouble();

        // Chama o método verificar passando a nota digitada
        verificar(nota);
    }
}