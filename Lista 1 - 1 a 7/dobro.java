package Lista1;

import java.util.Scanner;

public class dobro{
    public static void main(String[] args) {
    
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui pede um numero real pro usuario
        System.out.print("Digite um número real: ");
        
        // aqui le o numero digitado e guarda na variavel num
        double num = sc.nextDouble();

        // aqui calcula o dobro do numero multiplicando por 2
        double dobro = num * 2;
        
        // aqui calcula a terca parte dividindo por 3
        double terca = num / 3;
     
        // aqui mostra o valor do dobro com duas casas decimais
        System.out.printf("Dobro: %.2f%n", dobro);
        
        // aqui mostra a terca parte com quatro casas decimais
        System.out.printf("Terça parte: %.4f%n", terca);
 
        // aqui o programa termina poderia fechar o scanner tambem
    }
}