package Prova;

import java.util.Scanner;
public class Gargalo2 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    
        System.out.print("Nota CPU: ");
        int cpu=sc.nextInt();
        System.out.print("Nota GPU: ");
        int gpu=sc.nextInt();

        int dif=Math.abs(cpu-gpu);
        if(dif<=15) System.out.println("Equilibrado");
        else if(cpu>gpu) System.out.println("Gargalo GPU");
        else System.out.println("Gargalo CPU");
    }

    }
    

//Questão 2: Diagnóstico de Gargalo de Hardware
//Cenário: Muitos gamers sofrem com "Gargalo" (Bottleneck), que é quando uma peça do computador é
//muito mais fraca que a outra, limitando o desempenho.
//A Tarefa: Construa uma ferramenta de diagnóstico. Peça ao usuário uma nota (1 a 100) para a CPU e
//outra para a GPU. Envie esses dados para um método que calculará a diferença. Se a diferença for menor
//ou igual a 15, o sistema é equilibrado; caso contrário, informe a peça que causa o gargalo.
//Estruturas Obrigatórias:
//Scanner para capturar as notas.
//Um Método com retorno String que receba dois parâmetros inteiros.
//Estrutura condicional if-else dentro do método