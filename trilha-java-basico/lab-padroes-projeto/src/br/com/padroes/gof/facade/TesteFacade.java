package br.com.padroes.gof.facade;

public class TesteFacade {
	
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.migrarCliente("Medianeira", "85887-000");
	}
	
}