package br.com.padroes.gof.singleton;

public class SingletonLazyHolder {
	
	public static class InstanceHolder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	} 
}