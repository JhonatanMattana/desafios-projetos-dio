package br.com.desafio.dio.banco.conta;

import br.com.desafio.dio.banco.cliente.Cliente;
import br.com.desafio.dio.banco.enums.TipoConta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente, TipoConta.CONTA_CORRENTE);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta corrente ===");		
		super.imprimirInfosComuns();
	}
	
}