package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para ler dados digitados

public class DiaSemana {

    // Método responsável por mostrar o dia da semana
    public static void mostrar(int dia){
        
        // O switch verifica o número digitado
        switch(dia){
            
            case 1: 
                System.out.println("Domingo"); 
                break; // Encerra o switch

            case 2: 
                System.out.println("Segunda"); 
                break;

            case 3: 
                System.out.println("Terca"); 
                break;

            case 4: 
                System.out.println("Quarta"); 
                break;

            case 5: 
                System.out.println("Quinta"); 
                break;

            case 6: 
                System.out.println("Sexta"); 
                break;

            case 7: 
                System.out.println("Ssbado"); 
                break;

            default: 
                // Caso o número não esteja entre 1 e 7
                System.out.println("Invalido");
        }
    }

    public static void main(String[] args){
        
        // Cria o Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Digite um numero de 1 a 7: ");
        
        // Lê o número digitado
        int dia = sc.nextInt();

        // Chama o método mostrar
        mostrar(dia);
    }
}