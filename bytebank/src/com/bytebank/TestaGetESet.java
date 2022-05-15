package com.bytebank;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);

        System.out.println(conta.getNumero());

        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel Souza");
        conta.setTitular(gabriel);
        conta.getTitular().setProfissao("Programador");

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());

    }

}
