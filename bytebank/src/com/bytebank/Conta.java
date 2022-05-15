package com.bytebank;

public class Conta {

    double saldo;
    int    agencia = 42;
    int    numero;
    Cliente titular;

    public void depositar(double valor) {
	this.saldo += valor;
    }

    public boolean sacar(double valor) {
	if (this.saldo >= valor) {
	    this.saldo -= valor;
	    return true;
	} else {
	    return false;
	}
    }

    public boolean transferir(double valor, Conta contaDestino) {
	if (this.saldo >= valor) {
	    this.saldo -= valor;
	    contaDestino.depositar(valor);
	    return true;
	} else {
	    return false;
	}

    }
}
