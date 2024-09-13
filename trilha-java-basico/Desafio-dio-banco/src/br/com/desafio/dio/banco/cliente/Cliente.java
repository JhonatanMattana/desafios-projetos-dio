package br.com.desafio.dio.banco.cliente;

import java.util.List;

import br.com.desafio.dio.banco.conta.Conta;

public class Cliente {
	private String nomeCompleto;
	private long numeroCelular;
	List<Conta> contas;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public long getNumeroCelular() {
		return numeroCelular;
	}
	
	public void setNumeroCelular(long numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
}