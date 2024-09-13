package br.com.desafio.dio.banco;

import java.util.Arrays;

import br.com.desafio.dio.banco.cliente.Cliente;
import br.com.desafio.dio.banco.conta.Conta;
import br.com.desafio.dio.banco.conta.ContaCorrente;
import br.com.desafio.dio.banco.conta.ContaPoupanca;

public class ExcecuteBanco {
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Banco da DIO");
		
		Cliente cliente = new Cliente();
		cliente.setNomeCompleto("User Dio");
		cliente.setNumeroCelular(459912345678l);
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		banco.setContas(Arrays.asList(cc, poupanca));
		cliente.setContas(Arrays.asList(cc, poupanca));
		
		cc.depositar(150);
		cc.tranferir(100, poupanca);
		
		System.out.println(banco.getNome());
		cc.imprimirExtrato();
		System.out.println();
		poupanca.imprimirExtrato();
	}
	
}