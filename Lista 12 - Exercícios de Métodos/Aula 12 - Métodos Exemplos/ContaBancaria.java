package aula12_metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LUISGUILHERMEDESOUZA
 */
public class ContaBancaria {

    private double saldo;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria(1000.00);
        System.out.println("Conta criada com saldo de R$" + minhaConta.obterSaldo());
        
        int opcao = -1;
        
        while(opcao != 0){
            System.out.println("\n -- MENU --");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            try{
            opcao = sc.nextInt(); // a
            
            switch(opcao){
                case 1:
                System.out.println("Saldo atual: R$" + minhaConta.obterSaldo());
                break;
                case 2:
                    System.out.println("Digite o valor para depósito: ");
                    double valorDeposito = sc.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Digite o valor para saque: ");
                    double valorSaque = sc.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            }catch(Exception e){
                System.out.println("Entrada inválida! Digite apenas números.");
                sc.nextLine(); // Limpando o Buffer
            }
        }
        
//------- Versão sem interação ------------------------------------------------------------
//        ContaBancaria minhaConta = new ContaBancaria(1000.00);
//        System.out.println("Saldo inicial: R$" + minhaConta.obterSaldo());
//        
//        minhaConta.depositar(500.00);
//        System.out.println("Saldo após depósito: R$" + minhaConta.obterSaldo());
//        
//        minhaConta.sacar(200.00);
//        System.out.println("Saldo após depósito: R$" + minhaConta.obterSaldo());
//        
//        minhaConta.sacar(2000.00);
//        System.out.println("Saldo final: R$" + minhaConta.obterSaldo());
//-----------------------------------------------------------------------------------------
    }

    // Construtor - Método especial
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double obterSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

}
