package aula12_metodos;

import aula12_metodos.equacoes.Soma;
import aula12_metodos.voids.Mensagens;
import java.util.Scanner;

/**
 * @author LUISGUILHERMEDESOUZA
 */

public class SomaComMetodos {

//    public int somar(int a, int b){
//        int resultado = a + b;
//        return resultado;
//    }
    
    public static void main(String[] args) {
        Mensagens msn = new Mensagens();
        msn.bemVindo();
        
        Scanner sc = new Scanner(System.in);
        Soma somando = new Soma();
        
        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();
        
        int resultado = somando.dividir(a,b);
            //          somando - novo nome da classe | somar - nome do método
        
        System.out.println("O resultado é: "+resultado);
    }
}