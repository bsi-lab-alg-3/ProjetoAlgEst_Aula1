package agenda;

public class Contato {

	private Pessoa pessoa;
	
	private Contato proximo;
	private Contato anterior;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Contato getProximo() {
		return proximo;
	}
	public void setProximo(Contato proximo) {
		this.proximo = proximo;
	}
	public Contato getAnterior() {
		return anterior;
	}
	public void setAnterior(Contato anterior) {
		this.anterior = anterior;
	}
	
	
	
}
