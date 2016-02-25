package agenda;

public class AgendaDuplaPrincipal {

	public static void main(String[] args) {
		AgendaDupla agendaDupla = new AgendaDupla();
		
		for (int i = 0; i <= 10; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome("Pessoa " + i);
			pessoa.setTelefone("Telefone " + i);
			Contato contato = new Contato();
			contato.setPessoa(pessoa);
			agendaDupla.adicionarFim(contato);
		}

		System.out.println("Posicao Atual: "+agendaDupla.getPonteiro().getPessoa().getNome()); //Pessoa 0
		agendaDupla.avancar();
		System.out.println("Posicao Atual: "+agendaDupla.getPonteiro().getPessoa().getNome()); //Pessoa 1
		agendaDupla.avancar();
		agendaDupla.avancar();
		System.out.println("Posicao Atual: "+agendaDupla.getPonteiro().getPessoa().getNome()); //Pessoa 3
		agendaDupla.anterior();
		agendaDupla.anterior();
		System.out.println("Posicao Atual: "+agendaDupla.getPonteiro().getPessoa().getNome()); //Pessoa 2 
		
		

	}

}
