package folder;

import java.util.Scanner;

public class vogal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("e vogal");
                break;
            default:
                System.out.println("Nao e vogal");
        }

  
    }
}