package Lista3;

import java.util.Scanner;

public class ADepartamento {

    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui pede o nome da pessoa
        System.out.print("Digite seu nome: ");
        
        // aqui le o nome digitado e guarda na variavel nome
        String nome = sc.nextLine(); 

        // aqui pede a idade
        System.out.print("Digite sua idade: ");
        
        // aqui le a idade digitada e guarda na variavel idade
        int idade = sc.nextInt();
        
        // aqui pede o ano de nascimento
        System.out.print("Digite seu ano de nascimento: ");
        
        // aqui le o ano de nascimento e guarda na variavel nasc
        int nasc = sc.nextInt(); 
        
        // aqui pede o ano atual
        System.out.print("Digite o ano atual: ");
        
        // aqui le o ano atual e guarda na variavel ano
        int ano = sc.nextInt();  

        // aqui mostra os dados que o usuario digitou
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu ano de nascimento é: " + nasc);
        System.out.println("O ano atual é: " + ano);

        // aqui calcula a idade com base no ano atual e nascimento
        int idadeCalculada = ano - nasc;

        // aqui verifica se a pessoa tem 18 anos ou mais
        if (idadeCalculada >= 18) {
            System.out.println("APTO, pode beber a 51! ");
        } else {
            System.out.println("Você deve beber toddynho no role! ");
        }

        // aqui o programa termina poderia fechar o scanner tambem
    }
}