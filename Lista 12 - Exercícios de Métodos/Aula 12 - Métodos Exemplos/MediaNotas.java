package aula12_metodos;

import java.util.Scanner;

/**
 * @author LUISGUILHERMEDESOUZA
 */
public class MediaNotas { 
    
    public static double calcularMedia(double[]notas){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de alunos: ");
        int numALunos = sc.nextInt();
        
        for (int i = 0; i < numALunos; i++) {
            System.out.println("Digite o número de notas para o aluno "+i+": ");
            int numNotas = sc.nextInt();
            double[]notas = new double[numNotas];
            
            for (int j = 0; j < numNotas; j++) {
                System.out.println("Digite a nota "+(j+1)+": ");
                notas[j]=sc.nextDouble();
            }
            
            double media = calcularMedia(notas);
            System.out.println("A média do aluno "+i+" é: "+media);
        }
    }
}