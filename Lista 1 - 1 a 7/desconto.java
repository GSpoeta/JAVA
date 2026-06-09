package Lista1;

import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede pro usuario digitar o valor do produto
        System.out.print("Digite o valor do produto: ");
        
        // aqui le o valor digitado e guarda na variavel valor
        double valor = sc.nextDouble();
        
        // aqui calcula o novo valor com 5 por cento de desconto
        double novoValor = valor * 0.95;
        
        // aqui mostra o valor final com duas casas decimais
        System.out.printf("Valor com desconto de 5%%: R$ %.2f%n", novoValor);

        // aqui o programa termina poderia fechar o scanner tambem
    }
}