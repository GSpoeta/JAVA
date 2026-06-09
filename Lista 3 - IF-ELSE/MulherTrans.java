package Lista3;

import java.util.Scanner;

public class MulherTrans {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede o nome do cliente
        System.out.print("Digite seu nome: ");
        
        // aqui le o nome digitado e guarda na variavel nome
        String nome = sc.nextLine();
        
        // aqui pede o sexo do cliente M ou F
        System.out.print("Digite seu sexo (M/F): ");
        
        // aqui le o sexo digitado e guarda na variavel sexo
        String sexo = sc.nextLine();
        
        // aqui pede o valor das compras
        System.out.print("Digite o valor das compras: R$ ");
        
        // aqui le o valor da compra e guarda na variavel valorCompra
        double valorCompra = sc.nextDouble();
        
        // aqui cria as variaveis de desconto e valor final
        double desconto;
        double valorFinal;
        
        // aqui verifica o sexo pra definir o desconto
        // se for F aplica 13 por cento senao aplica 5 por cento
        if (sexo.equalsIgnoreCase("F")) {
            desconto = valorCompra * 0.13;
        } else {
            desconto = valorCompra * 0.05;
        }
        
        // aqui calcula o valor final subtraindo o desconto
        valorFinal = valorCompra - desconto;
        
        // aqui mostra os dados finais da compra
        System.out.println("\nCliente: " + nome);
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final com desconto: R$ " + valorFinal);
        
        // aqui fecha o scanner depois de usar
        sc.close();
    }
}