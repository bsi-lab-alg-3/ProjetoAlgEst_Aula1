package exarraylist;

public class Instituicao {

	private String nome;
	private String endereco;
	private int numero;
	//ctrl + 3 - gcuf
	
	public Instituicao() {
		super();
	}
	public Instituicao(String nome) {
		super();
		this.nome = nome;
	}
	public Instituicao(String nome, String endereco, int numero) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
	}
	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
