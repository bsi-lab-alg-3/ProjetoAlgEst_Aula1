package main;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Testes");
		System.out.println(p);
		
		
		
		Pessoa p1 = new Pessoa();
		System.out.println(p1);
		p1.setNome("Romulo");
		Pessoa p2 = p1;
		System.out.println(p2);
		p2.setNome("Lucas");
		
		System.out.println(p1.getNome());

	}

}
