package agenda;

public class AgendaPrincipal {

	// main
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.listar();
		
		for (int i = 0; i <= 10; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome("Pessoa " + i);
			pessoa.setTelefone("Telefone " + i);
			Contato contato = new Contato();
			contato.setPessoa(pessoa);
			agenda.adicionar(contato);
		}
		System.out.println("-----LISTA 1-----");
		agenda.listar();
		Pessoa novo = new Pessoa();
		novo.setNome("Romulo");
		novo.setTelefone("8888-8888");
		Contato novoContato = new Contato();
		novoContato.setPessoa(novo);
		agenda.adicionarNaPosicao(novoContato, 3);
		System.out.println("-----LISTA 2-----");
		agenda.listar();
		
		
		Contato c = agenda.buscarPorTelefone("Telefone 4");
		System.out.println("Achei " + c.getPessoa().getNome());

	}

}
