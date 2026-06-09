package Lista4;

import java.util.Scanner;

public class oito {

    public static void main(String[] args) {

        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);

        // aqui cria uma variavel pra somar as idades
        int soma = 0;

        // aqui repete 5 vezes pra pedir 5 idades
        for (int i = 1; i <= 5; i++) {

            // aqui pede a idade pro usuario
            System.out.print("Digite a idade: ");
            
            // aqui le a idade digitada e guarda na variavel idade
            int idade = sc.nextInt();

            // aqui soma a idade digitada com as anteriores
            soma = soma + idade;
        }

        // aqui calcula a media das idades
        double media = soma / 5.0;

        // aqui mostra a media final
        System.out.println("Média das idades = " + media);

        // aqui o programa termina poderia fechar o scanner tambem
    }
}