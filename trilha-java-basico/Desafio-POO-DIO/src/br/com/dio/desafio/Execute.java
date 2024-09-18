package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Execute {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descricao curso de Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de JS");
		curso2.setDescricao("Descricao curso de JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricao mentoria de Java");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp de Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJhonatan = new Dev();
		devJhonatan.setNome("Jhonatan");
		devJhonatan.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Jhonatan: " + devJhonatan.getConteudosInscritos());
		devJhonatan.progredir();
		System.out.println("Conteudos concluidos Jhonatan: " + devJhonatan.getConteudosConcluidos());
		System.out.println("XP: " + devJhonatan.calcularTotalXP());
		
		System.out.println("------------------------------------------------------");
		
		Dev devFulano = new Dev();
		devFulano.setNome("Fulano");
		devFulano.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Fulano: " + devFulano.getConteudosInscritos());
		devFulano.progredir();
		System.out.println("Conteudos concluidos Fulano: " + devFulano.getConteudosConcluidos());
		System.out.println("XP: " + devFulano.calcularTotalXP());
	}
	
}