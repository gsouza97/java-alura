package com.bytebank;

public class Conta {

    private        double  saldo;
    private        int     agencia = 42;
    private        int     numero;
    private        Cliente titular;
    private static int     total;

    public Conta(int agencia, int numero) {
	total++;
	System.out.println("O total de contas é: " + total);
	this.agencia = agencia;
	this.numero = numero;
    }

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

    public double getSaldo() {
	return saldo;
    }

    public int getAgencia() {
	return agencia;
    }

    public void setAgencia(int agencia) {
	this.agencia = agencia;
    }

    public int getNumero() {
	return numero;
    }

    public void setNumero(int numero) {
	this.numero = numero;
    }

    public Cliente getTitular() {
	return titular;
    }

    public void setTitular(Cliente titular) {
	this.titular = titular;
    }
}
