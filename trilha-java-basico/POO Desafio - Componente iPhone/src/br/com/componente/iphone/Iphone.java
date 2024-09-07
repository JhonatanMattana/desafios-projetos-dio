package br.com.componente.iphone;

import br.com.componente.iphone.aparelhotelefonico.AparelhoTelefonico;
import br.com.componente.iphone.navegadorinternet.NavegadorInternet;
import br.com.componente.iphone.reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibir a pagina: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar pagina");		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("ligando para o numero " + numero);		
	}

	@Override
	public void atender() {
		System.out.println("Atender ligacao");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz");		
	}

	@Override
	public void tocar() {
		System.out.println("Tocar musica");		
	}

	@Override
	public void pausar() {
		System.out.println("Pausar musica");		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a musica" + musica);		
	}

}