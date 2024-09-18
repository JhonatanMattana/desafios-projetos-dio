package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;
	
	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", getTitulo()=" + getTitulo() + ", getDescricao()="
				+ getDescricao() + "]";
	}
 
}