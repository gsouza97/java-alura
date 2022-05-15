package com.bytebank;

public class TestaBanco {

    public static void main(String[] args) {
	Cliente gabriel = new Cliente();
	gabriel.setNome("Gabriel Souza");
	gabriel.setCpf("222.222.222-22");
	gabriel.setProfissao("Programador");

	Conta conta = new Conta();
	conta.depositar(100);
	conta.setTitular(gabriel);

	System.out.println(conta.getTitular().getNome());
    }
}
