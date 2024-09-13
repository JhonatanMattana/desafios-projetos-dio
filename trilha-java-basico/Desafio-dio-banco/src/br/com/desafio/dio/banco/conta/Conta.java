package br.com.desafio.dio.banco.conta;

import br.com.desafio.dio.banco.cliente.Cliente;
import br.com.desafio.dio.banco.enums.TipoConta;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAl = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected TipoConta tipoConta;
	
	public Conta(Cliente cliente, TipoConta tipoConta) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAl++;
		this.cliente = cliente;
		this.tipoConta = tipoConta;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void tranferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Numero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
		System.out.println(String.format("Cliente: %s", cliente.getNomeCompleto()));
		System.out.println(String.format("Tipo conta: %s", tipoConta.getDescricao()));
	}

}