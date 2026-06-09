package Lista2;
 
import java.util.Scanner;

public class bissexto {
     public static void main(String[] args){
         
         // aqui cria o scanner pra ler o que o usuario digitar
         Scanner sc = new Scanner(System.in);
         
         // aqui pede o ano pro usuario
         System.out.println("digite um ano: ");  
         
         // aqui le o ano digitado e guarda na variavel ano
         int ano = sc.nextInt();
       
         // aqui verifica se o ano e bissexto usando as regras de divisao
         // divisivel por 4 e nao por 100 ou divisivel por 400
         boolean bissexto = ((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0);
  
         // aqui mostra se o ano e bissexto ou nao
         System.out.println("O ano "+ano+" é bissexto? "+bissexto);  
     
         // aqui o programa termina poderia fechar o scanner tambem
     }
}