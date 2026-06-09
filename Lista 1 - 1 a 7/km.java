package Lista1;

import java.util.Scanner;

public class km {
    public static void main(String[] args) {
        
        // aqui cria o scanner pra ler o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        // aqui pede a distancia em metros
        System.out.print("Digite a distância em metros: ");
        
        // aqui le o valor digitado e guarda na variavel metros
        double metros = sc.nextDouble();
        
        // aqui converte metros para quilometros dividindo por 1000
        double km = metros / 1000;
        
        // aqui converte metros para centimetros multiplicando por 100
        double cm = metros * 100;
        
        // aqui mostra o valor em quilometros
        System.out.println("Quilômetros: " + km);
        
        // aqui mostra o valor em centimetros
        System.out.println("Centímetros: " + cm);
        
        // aqui fecha o scanner depois de usar
        sc.close();
    }
}