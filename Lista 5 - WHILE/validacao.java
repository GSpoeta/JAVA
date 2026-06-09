package Lista5;

import java.util.Scanner;

public class validacao {
  
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
     
        // aqui variavel do login do funcionario
        int login;
        
        // aqui variavel da senha
        int senha;
    
        // aqui pede o id do funcionario
        System.out.println("\nDigite o ID do funcionario: ");
        login = sc.nextInt();
      
        // aqui mostra o funcionario que foi digitado
        System.out.println("Funcionario N. " + login);
      
        // aqui pede a senha
        System.out.println("\nDigite a sua senha:");
        senha = sc.nextInt();

        // aqui fica repetindo enquanto a senha estiver errada
        while (senha != 1234) {
            
            // aqui avisa que a senha esta incorreta
            System.out.println("Senha incorreta. Tente novamente:");
            
            // aqui pede a senha novamente
            senha = sc.nextInt();
        }

        // aqui libera o acesso quando a senha estiver correta
        System.out.println("Acesso permitido!");

        // aqui o programa termina poderia fechar o scanner tambem
    }
}