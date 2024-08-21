package br.com.desafiocontrolefluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o valor do primeiro parametro");
		int parametroUm = scanner.nextInt();

		System.out.println("Digite o valor do segundo parametro");
		int parametroDois = scanner.nextInt();
	
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o numero " + i);
		}
	}

}