package Lista3;

import java.util.Scanner;

public class Multa {

    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede a velocidade do carro
        System.out.print("Digite a velocidade do carro (km/h): ");
        
        // aqui le a velocidade digitada e guarda na variavel velocidade
        int velocidade = sc.nextInt();
        
        // aqui define o limite de velocidade da via
        int limite = 80;
        
        // aqui verifica se o motorista passou do limite
        if (velocidade > limite) {
            
            // aqui calcula o quanto passou do limite
            int excesso = velocidade - limite;
            
            // aqui calcula o valor da multa baseado no excesso
            int multa = excesso * 5;
            
            // aqui mostra que foi multado
            System.out.println("Voce foi multado!");
            
            // aqui mostra quantos km passou do limite
            System.out.println("Velocidade acima do limite: " + excesso + " km/h");
            
            // aqui mostra o valor da multa
            System.out.println("Valor da multa: R$ " + multa);
            
        } else {
            // aqui entra se nao passou do limite
            System.out.println("Voce nao foi multado. Dirija com seguranca!");
        }
        
        // aqui o programa termina poderia fechar o scanner tambem
    }
}