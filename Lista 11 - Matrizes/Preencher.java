package lista11;

public class Preencher {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        int valor = 1;

        // Preenchendo a matriz de 1 a 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}