package Lista2;
 
import java.util.Scanner;

public class conversor {
     public static void main(String[] args){
         
         // aqui cria o scanner pra ler o que o usuario digitar
         Scanner sc = new Scanner(System.in);
         
         // aqui pede um angulo pro usuario
         System.out.println("Informe um angulo: ");
         
         // aqui le o angulo digitado e guarda na variavel angulo
         double angulo = sc.nextDouble();
         
         // aqui converte o angulo de graus pra radianos e calcula o seno
         double s = Math.sin(Math.toRadians(angulo));
         
         // aqui mostra o resultado do seno do angulo informado
         System.out.println("O seno de "+angulo+ " é igual a "+s);
     
         // aqui o programa termina poderia fechar o scanner tambem
     }
}