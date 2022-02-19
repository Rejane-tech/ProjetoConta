package br.com.letscode.banco;

import java.math.BigDecimal;

public class Cliente {

    protected String nome_ou_razao_social;
    protected String cpf_ou_cnpj;
    protected double saldo;

    public Cliente() {

    }

    public Cliente(String nome, String cpf_ou_cnpj, double saldo) {
        this.nome_ou_razao_social = nome;
        this.cpf_ou_cnpj = cpf_ou_cnpj;
        this.saldo = saldo;
    }

    public String getNome_ou_razao_social() {
        return nome_ou_razao_social;
    }

    public void setNome_ou_razao_social(String nome_ou_razao_social) {
        this.nome_ou_razao_social = nome_ou_razao_social;
    }

    public String getCpf_ou_cnpj() {
        return cpf_ou_cnpj;
    }

    public void setCpf_ou_cnpj(String cpf_ou_cnpj) {
        this.cpf_ou_cnpj = cpf_ou_cnpj;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome_ou_razao_social='" + nome_ou_razao_social + '\'' +
                ", cpf_ou_cnpj='" + cpf_ou_cnpj + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
