**1 - salario**



package atividades;



import java.util.Scanner;



public class salario {

    public static void main(String\[] args) {

 

       try(Scanner sc = new Scanner(System.in)) {

 

            System.out.print("Digite o nome do funcionário: ");

            String nome = sc.nextLine();

 

            System.out.print("Digite o salário: ");

            double salario = sc.nextDouble();

 

            System.out.println("Funcionário: " + nome + " | Salário: R$ " + String.format("%.2f", salario));

 

        }

    }

}









**2 - Antecessor e Sucessor**



package atividades;



import java.util.Scanner;



public class AntecessorSucessor {

    public static void main(String\[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Digite um número inteiro: ");

        int num = sc.nextInt();



 

        System.out.println("Antecessor: " + (num - 1));

        System.out.println("Sucessor: " + (num + 1));



        

    }

}









**3 - Dobro e Terça Parte**



package atividades;



import java.util.Scanner;



public class dobro{

    public static void main(String\[] args) {

 

        Scanner sc = new Scanner(System.in);



        System.out.print("Digite um número real: ");

        double num = sc.nextDouble();



        double dobro = num \* 2;

        double terca = num / 3;

 

        System.out.printf("Dobro: %.2f%n", dobro);

        System.out.printf("Terça parte: %.4f%n", terca);





    }

}











**4- conversor de medida**



package atividades;



import java.util.Scanner;



public class km {

    public static void main(String\[] args) {

 

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância em metros: ");

        double metros = sc.nextDouble();

        double km = metros / 1000;

        double cm = metros \* 100;

 

        System.out.println("Quilômetros: " + km);

 

        System.out.println("Centímetros: " + cm);

 



    }

}









**5- conversor de moeda**



package atividades;



import java.util.Scanner;



public class moeda {

    public static void main(String\[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Quantos reais você tem? ");

        double reais = sc.nextDouble();



        double dolar = reais / 5.45;



        System.out.printf("Você pode comprar: US$ %.2f%n", dolar);



     

    }

}











**6- desconto no produto**



package atividades;



import java.util.Scanner;



public class desconto {

    public static void main(String\[] args) {

                Scanner sc = new Scanner(System.in);



        System.out.print("Digite o valor do produto: ");

        double valor = sc.nextDouble();



 

        double novoValor = valor \* 0.95;



        

        System.out.printf("Valor com desconto: R$ %.2f%n", novoValor);

        

    }

}













**7- salario do cupincha**





package atividades;



import java.util.Scanner;



public class cupicha {

    public static void main(String\[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Quantos dias trabalhou? ");

        int dias = sc.nextInt();



        double salario = dias \* 8 \* 25;



        System.out.printf("Salário total: R$ %.2f%n", salario);



  

    }

}

