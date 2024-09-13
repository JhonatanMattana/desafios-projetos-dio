package br.com.desafio.dio.banco.conta;

public interface IConta {
	void sacar(double valor);
	void depositar(double valor);
	void tranferir(double valor, Conta contaDestino);
	void imprimirExtrato();
}