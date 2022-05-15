package com.bytebank;

public class TestaBanco {

    public static void main(String[] args) {
	Cliente gabriel = new Cliente();
	gabriel.nome = "Gabriel Souza";
	gabriel.cpf = "222.222.222-22";
	gabriel.profissao = "Programador";

	Conta conta = new Conta();
	conta.depositar(100);
	conta.setTitular(gabriel);

	System.out.println(conta.getTitular().nome);
    }
}
