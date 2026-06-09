package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class MaiorTres {

    // Método responsável por verificar qual é o maior entre três números
    public static void verificar(int a, int b, int c){
        
        // Verifica se o primeiro número é maior ou igual aos outros dois
        if(a >= b && a >= c){
            System.out.println("Maior: " + a);
        
        // Caso contrário, verifica se o segundo número é maior ou igual aos outros
        } else if(b >= a && b >= c){
            System.out.println("Maior: " + b);
        
        // Se nenhuma das condições acima for verdadeira,
        // então o terceiro número é o maior
        } else {
            System.out.println("Maior: " + c);
        }
    }

    public static void main(String[] args){
        
        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Digite o primeiro numero: ");
        int a = sc.nextInt();

        // Solicita o segundo número
        System.out.print("Digite o segundo numero: ");
        int b = sc.nextInt();

        // Solicita o terceiro número
        System.out.print("Digite o terceiro numero: ");
        int c = sc.nextInt();

        // Chama o método verificar
        verificar(a, b, c);
    }
}