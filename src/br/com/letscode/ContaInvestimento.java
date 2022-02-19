package br.com.letscode;

import br.com.letscode.contas.ContaBancaria;

public class ContaInvestimento extends ContaBancaria {


    public ContaInvestimento(String cpf_ou_cnpj, String nome, double Saldo) {

        super(cpf_ou_cnpj, nome, Saldo);
    }
}