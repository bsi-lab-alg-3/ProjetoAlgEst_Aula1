package main;

public class Elemento {
	private int valor;
	private Elemento proximo;

	public Elemento getProximo() {
		return proximo;
	}

	public int getValor() {
		return valor;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public static void alteraAi(Elemento e){
		e.setValor(45);
	}

	public static void visitar(Elemento e) {
		System.out.println(e+" valor: "+e.getValor());
		if(e.getProximo()!=null){
			Elemento.visitar(e.getProximo());
		}
	}
}
