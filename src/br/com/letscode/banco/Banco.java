package br.com.letscode.banco;

import java.util.ArrayList;

import java.util.List;

public class Banco {


    public static void abrirConta() {


        Cliente cli = new Cliente("Ana", "261.061.368-75", 0);
        Cliente pf = new PessoaFisica("Debora", "321.234.231-30", 0);
        Cliente pj = new PessoaJuridica("MATERA", "21.233.432001-01", 0);

        Cliente[] clientes = {cli, pf, pj};

        List<Cliente> lista = new ArrayList<>();

        lista.add(cli);
        lista.add(pf);
        lista.add(pf);

        System.out.println(lista);

    }

}

