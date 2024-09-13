package br.com.desafio.dio.banco.enums;

public enum TipoConta {
	CONTA_CORRENTE(1, "Conta Corrente"),
	CONTA_POUPANCA(2, "Conta Poupança");

	private int id;
	private String descricao;
	
	TipoConta(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
}