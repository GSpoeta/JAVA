package Lista4;

public class um {

    public static void main(String[] args) {

        // aqui faz um loop pra gerar a tabuada de 1 ate 10
        for (int i = 1; i <= 10; i++) {

            // aqui mostra qual tabuada esta sendo exibida
            System.out.println("Tabuada do " + i);

            // aqui faz o segundo loop pra multiplicar de 1 ate 10
            for (int j = 1; j <= 10; j++) {
                
                // aqui mostra a multiplicacao i vezes j
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            // aqui pula uma linha pra separar as tabuadas
            System.out.println();
        }

        // aqui o programa termina
    }
}