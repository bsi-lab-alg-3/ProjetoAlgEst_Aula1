package agenda;

public class AgendaPrincipal {

	// main
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		for (int i = 0; i < 10; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome("Pessoa " + i);
			pessoa.setTelefone("Telefone " + i);
			Contato contato = new Contato();
			contato.setPessoa(pessoa);
			agenda.adicionar(contato);
		}

	}

}
