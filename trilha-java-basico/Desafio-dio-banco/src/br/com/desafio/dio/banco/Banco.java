package br.com.desafio.dio.banco;

import java.util.List;

import br.com.desafio.dio.banco.conta.Conta;

public class Banco {
	private String nome;
	
	List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
}