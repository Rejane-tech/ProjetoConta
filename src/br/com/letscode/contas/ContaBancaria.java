package br.com.letscode.contas;


public class ContaBancaria {

    private String cpf_ou_cnpj;
    private String nome;
    private double saldo;


    public ContaBancaria(String cpf_ou_cnpj, String nome, double saldo) {
        this.cpf_ou_cnpj = cpf_ou_cnpj;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getCpf_ou_cnpj() {
        return cpf_ou_cnpj;
    }

    public void setCpf_ou_cnpj(String cpf_ou_cnpj) {
        this.cpf_ou_cnpj = cpf_ou_cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + 5.0;
    }


    public void transferir(ContaBancaria conta, double valor) {
        if (this.getSaldo() < valor) {
            System.out.println("Saldo insuficiente para a operação");
        } else {
            sacar(this.getSaldo() - valor);
            sacar(conta.getSaldo() + valor);
        }
    }

    public void rendimentoPoupanca(double valor) {

        saldo = saldo + valor * 0.01;
    }

    public void investirPessoaFisica(double valor) {

        saldo = saldo + valor * 0.10;
    }

    public void investirPessoaJuridica(double valor) {

        saldo = saldo + valor * 0.12;
    }

    public String toString() {
        return "Conta "
                + cpf_ou_cnpj
                + ", Nome:"
                + nome
                + ", Saldo: $"
                + String.format("%.2f", saldo);


    }

}