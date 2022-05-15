package com.bytebank;

public class TesteSacaNegativo {

    public static void main(String[] args) {
	Conta conta = new Conta();
	conta.depositar(100);
	conta.sacar(300);
	System.out.println(conta.getSaldo());
    }
}
