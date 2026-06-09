package Gabriel12;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Calculadora {

    // Método responsável por realizar o cálculo
    // Recebe dois números e um operador matemático
    public static void calcular(double a, double b, char op){
        
        // Estrutura switch verifica qual operação foi escolhida
        switch(op){
            
            case '+': 
                // Soma os dois números
                System.out.println(a + b); 
                break;

            case '-': 
                // Subtrai o segundo número do primeiro
                System.out.println(a - b); 
                break;

            case '*': 
                // Multiplica os dois números
                System.out.println(a * b); 
                break;

            case '/': 
                // Verifica se o divisor é diferente de zero
                if(b != 0)
                    // Realiza a divisão
                    System.out.println(a / b);
                else
                    // Mensagem de erro se tentar dividir por zero
                    System.out.println("Divisão por zero");
                break;

            default:
                // Caso o operador digitado não seja válido
                System.out.println("Operacao invalida");
        }
    }

    public static void main(String[] args){
        
        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Digite o primeiro numero: ");
        double a = sc.nextDouble();

        // Solicita o segundo número
        System.out.print("Digite o segundo numero: ");
        double b = sc.nextDouble();

        // Solicita a operação matemática
        System.out.print("Digite a operacao (+ - * /): ");
        
        // Lê o primeiro caractere digitado
        char op = sc.next().charAt(0);

        // Chama o método calcular
        calcular(a, b, op);
    }
}