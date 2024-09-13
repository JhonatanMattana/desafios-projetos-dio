package br.com.desafio.dio.banco.conta;

import br.com.desafio.dio.banco.cliente.Cliente;
import br.com.desafio.dio.banco.enums.TipoConta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente, TipoConta.CONTA_POUPANCA);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta poupanca ===");
		super.imprimirInfosComuns();
	}


}