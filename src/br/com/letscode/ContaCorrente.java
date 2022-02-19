package br.com.letscode;

import br.com.letscode.contas.ContaBancaria;

public class ContaCorrente extends ContaBancaria {


    public ContaCorrente(String cpf_ou_cnpj, String nome, double Saldo) {

        super(cpf_ou_cnpj, nome, Saldo);
    }
}

