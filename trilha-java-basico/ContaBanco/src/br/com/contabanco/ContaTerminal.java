package br.com.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        String mensagemContaCriada;
	    
	    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\t ------ Sistema Conta Terminal ------");
        System.out.println("* Cadastro de conta:\n");
        
        System.out.println("Por favor, digite o seu nome completo !");
        nomeCliente = scanner.nextLine();
        
        System.out.println("\nPor favor, digite o numero da Agencia !");
		agencia = scanner.nextLine();
        
        System.out.println("\nPor favor, digite o numero da Conta !");
		numero = scanner.nextInt();
		
		System.out.println("\nPor favor, digite o saldo inicial de sua Conta !");
		saldo = scanner.nextDouble();
		
     
        mensagemContaCriada = "\n\nOla ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(numero))
            .concat(" e seu saldo ")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível.");
     
        System.out.println(mensagemContaCriada);
	}
	
}