package Lista3;

import java.util.Scanner;
import java.time.LocalDate;

public class voto {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede o ano de nascimento
        System.out.print("Digite seu ano de nascimento: ");
        
        // aqui le o ano de nascimento e guarda na variavel nasc
        int nasc = sc.nextInt(); 
        
        // aqui pega o ano atual do sistema automaticamente
        int anoAtual = LocalDate.now().getYear();
        
        // aqui mostra o ano atual
        System.out.println("Ano atual: " + anoAtual);
    
        // aqui calcula a idade da pessoa
        int idadeCalculada = anoAtual - nasc;

        // aqui verifica se a pessoa pode votar (16 anos ou mais)
        if (idadeCalculada >= 16) {
            // aqui mostra que pode votar
            System.out.println("Voce pode votar ");
        } else {
            // aqui mostra que nao pode votar
            System.out.println("Voce nao pode votar ");
        }

        // aqui mostra a idade calculada
        System.out.println("Voce tem: " + idadeCalculada + " anos");
    }
}