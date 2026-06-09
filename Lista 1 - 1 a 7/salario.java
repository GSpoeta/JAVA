package Lista1;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
      
       // aqui usa o try com o scanner entao ele ja fecha sozinho no final
       try(Scanner sc = new Scanner(System.in)) {
            
            // aqui pede o nome do funcionario
            System.out.print("Digite o nome do funcionário: ");
            
            // aqui le o nome digitado incluindo espacos e guarda na variavel nome
            String nome = sc.nextLine();
           
            // aqui pede o salario do funcionario
            System.out.print("Digite o salário: ");
            
            // aqui le o salario digitado e guarda na variavel salario
            double salario = sc.nextDouble();
            
            // aqui mostra o nome e o salario formatado com duas casas decimais
            System.out.println("Funcionário: " + nome + " | Salário: R$ " + String.format("%.2f", salario));
           
            // aqui quando sair do try o scanner ja eh fechado automaticamente
        }
    }
}