package Lista3;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede o login pro usuario
        System.out.print("Digite o login: ");
        
        // aqui le o login digitado e guarda na variavel login
        String login = sc.nextLine();
        
        // aqui pede a senha pro usuario
        System.out.print("A senha: ");
        
        // aqui le a senha digitada e guarda na variavel senha
        String senha = sc.nextLine();
 
        // aqui o codigo parece estar incompleto pois nao tem a logica de validacao ainda
        // provavelmente aqui deveria ter os ifs pra verificar login e senha
    
    


            // aqui verifica se o login tem pelo menos 6 caracteres nao tem espaco
        // e se o login e igual a luis123 ou guilerme para dar uma mensagem diferente
        if (login.length() >= 6 && !login.contains(" ") &&
           (login.equalsIgnoreCase("luis123") || login.equalsIgnoreCase("guilerme"))) {
        System.out.println("PORNO HUB MULHERES TRANS & XVIDE0S GAY´S (ABA PERSONALIZADADA PELO USUSARIO).");
            
        // aqui mostra mensagem de login valido e bem vindo
        System.out.println("Login valido bem-vindo ao ");
        
        
        } else if (login.length() >= 6 && !login.contains(" ")) {
        
        // aqui entra se o login for valido pelo tamanho e sem espaco
        System.out.println("Login valido Bem-vindo.");  
            
        } else {

        // aqui entra se o login nao passar nas validacoes
        System.out.println("Login invalido ou senha invalido.");

        }

    }
}
