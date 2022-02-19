package br.com.letscode;

import br.com.letscode.contas.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {


    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaInvestimento conta = new ContaInvestimento("25382033847", "Alexandre", 0);
        System.out.print(conta);


        System.out.println();
        System.out.println("Entre com o valor do deposito: ");
        double depositoValor = sc.nextDouble();
        conta.depositar(depositoValor);
        System.out.println("Alteracao dos dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor do saque: ");
        double saqueValor = sc.nextDouble();
        conta.sacar(saqueValor);
        System.out.println("Alteracao dos dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println(" Insira o saldo a cima para investir ");
        double investimentoValor = sc.nextDouble();
        conta.investirPessoaFisica(investimentoValor);
        System.out.println("Alteracao dos dados da conta: ");
        System.out.println(conta);
    }
}
