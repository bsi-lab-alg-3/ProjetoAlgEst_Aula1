package main;

public class PrincipalListaEncadeada {

	public static void main(String[] args) {
		Elemento e1 = new Elemento();
		e1.setValor(10);
		
		System.out.println(e1); //end 1
		
		Elemento e2 = new Elemento();
		e2.setValor(20);
		System.out.println(e2); //end 2
		
		e1.setProximo(e2);
		System.out.println(e1.getProximo()); //end 2
		
		Elemento e3 = new Elemento();
		e2.setProximo(e3);
		e3.setValor(30);
		System.out.println(e2); //end 2
		
		//                 e1           e2           e3
		System.out.println(e1.getValor()); //10
		System.out.println(e1.getProximo().getValor()); //20
		System.out.println(e1.getProximo().getProximo().getValor()); //30
		
		
		//e2.setValor(40);
		//System.out.println(e1.getProximo().getValor()); //40
		
		//Elemento.alteraAi(e2);
		//System.out.println(e1.getProximo().getValor()); //?
		
		
		Elemento.visitar(e1);
		
		Elemento percorrer = e1;
		while(percorrer!=null){
			System.out.println(percorrer.getValor());
			percorrer = percorrer.getProximo();
		}
		
	}
	
		
	
}
