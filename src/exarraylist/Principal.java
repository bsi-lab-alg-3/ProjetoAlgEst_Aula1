package exarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
	// main
	public static void main(String[] args) {
		// antes do jdk 7
		// ArrayList listaBagunca = new ArrayList();
		// listaBagunca.add("Teste");
		// listaBagunca.add(new Integer(10));
		// listaBagunca.add(new Long(23));
		// listaBagunca.add(34.2);
		// String primeiro = (String)listaBagunca.get(1);

		ArrayList<Instituicao> lista = new ArrayList<Instituicao>();
		lista.add(new Instituicao("UNIRN"));
		lista.add(new Instituicao("UFRN"));
		lista.add(new Instituicao("UNP"));
		lista.add(new Instituicao("FACEX"));

		Iterator<Instituicao> interator = lista.iterator();
		// while - iterate over interator
		while (interator.hasNext()) { // existe proximo?
			// recupera e anda no ponteiro
			Instituicao instituicao = (Instituicao) interator.next();
			System.out.println("Nome: " + instituicao.getNome());
		}

		// foreach
		for (Instituicao instituicao : lista) {
			System.out.println("Nome: " + instituicao.getNome());
		}

		System.out.println("Tamanho: " + lista.size());
		System.out.println("Vazia? " + lista.isEmpty());
		System.out.println("A ser removido: " + lista.get(2).getNome());
		lista.remove(2);
		for (Instituicao instituicao : lista) {
			System.out.println("Nome: " + instituicao.getNome());
		}
		for (int i = 0; i < 9999999; i++) {
			lista.add(new Instituicao("Nome " + i));

		}
		for (Instituicao instituicao : lista) {
			System.out.println("Nome: " + instituicao.getNome());
		}

	}
}
