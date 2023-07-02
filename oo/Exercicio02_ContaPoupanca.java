package oo;

public class Exercicio02_ContaPoupanca extends Exercicio02_Conta {

	double juros;

	public void Exercicio02_ContaPoupança(int agencia, int conta, String titular, double juros) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.juros = juros;
	}
	
}
