package aula12_metodos;

import java.util.Scanner;

/**
 *
 * @author LUISGUILHERMEDESOUZA
 */
public class VerificarNumeroPar {

    public static boolean numeroPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int numero = sc.nextInt();

        boolean resultado = numeroPar(numero);

        if (resultado) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}