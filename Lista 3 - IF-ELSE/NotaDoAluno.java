package Lista3;

import java.util.Scanner;

public class NotaDoAluno {
   
    public static void main(String[] args) {
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede o nome do aluno
        System.out.print("Digite seu nome: ");
        
        // aqui le o nome e guarda na variavel nome
        String nome = sc.nextLine();    
        
        // aqui pede a primeira nota
        System.out.print("Primeira nota: ");
        
        // aqui le a primeira nota e guarda na variavel n1
        double n1 = sc.nextDouble();
        
        // aqui pede a segunda nota
        System.out.print("Segunda nota");
        
        // aqui le a segunda nota e guarda na variavel n2
        double n2 = sc.nextDouble();
        
        // aqui calcula a media das duas notas
        double media = (n1 + n2) / 2;
        
        // aqui mostra o nome do aluno
        System.out.println("Nome do aluno: " + nome);
        
        // aqui mostra a media formatada com duas casas decimais
        System.out.printf("A media do aluno é: %.2f",media);
        
        // aqui verifica a situacao do aluno pela media
        if(media >= 7){
            // aqui aluno aprovado
            System.out.println(" Aluno aprovado");
        }else if(media >= 5){
            // aqui aluno em recuperacao
            System.out.println(" Aluno em recuperaçao");
        }else{ 
            // aqui aluno reprovado
            System.out.println(" Aluno reprovado");
        } 
    
        // aqui o programa termina poderia fechar o scanner tambem
    }
}