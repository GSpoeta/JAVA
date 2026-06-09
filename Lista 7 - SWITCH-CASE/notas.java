package lista7;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota (A-F): ");
        char nota = sc.next().toUpperCase().charAt(0);

        switch (nota) {
            case 'A':
            case 'B':
                System.out.println("Aprovado parabens");
                break;
                
                               
            case 'C':
            case 'D':    
               System.out.println("Aprovado por conselho");
                break;   
                
            case 'F':
                System.out.print("Fez recuperação? (s/n): ");
                char rec = sc.next().toLowerCase().charAt(0);

                if (rec == 's') {
                    System.out.println("Pode recuperar");
                } else {
                    System.out.println("Reprovado");
                }
                break;
            default:
                System.out.println("Nota inválida");
        }

    }
}