package Lista3;

import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede o dia da semana
        System.out.print("Digite um dia da semana: ");
        
        // aqui le o dia digitado e ja transforma tudo em minusculo pra facilitar a comparacao
        String dia = sc.nextLine().toLowerCase();
        
        // aqui verifica se e dia util (segunda a sexta)
        if (dia.equals("segunda") || dia.equals("terca") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
            
            // aqui mostra que e dia util
            System.out.println(dia + " é um dia útil.");
            
        // aqui verifica se e fim de semana
        } else if  (dia.equals("sabado") || dia.equals("domingo")) {
            
            // aqui mostra que e fim de semana
            System.out.println(dia + " é fim de semana.");
            
        } else {
            // aqui entra se nao for nenhum dia valido
            System.out.println("Dia inválido! Digite corretamente.");
        }
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}