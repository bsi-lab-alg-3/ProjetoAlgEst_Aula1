package agenda;

public class Agenda {

	private Contato primeiro;
	private Contato auxiliar;
	//CRUD - Create Release Update Delete
	
	public void adicionar(Contato contato){
		if(primeiro == null){
			primeiro = contato;
			auxiliar = contato;
		}else{
			//Adiciona no final
			auxiliar.setProximo(contato);
			auxiliar = contato;
			
		}
	}
	public void adicionarNoComeco(Contato contato){
		if(primeiro == null){
			primeiro = contato;
			auxiliar = contato;
		}else{
			contato.setProximo(primeiro);
			primeiro = contato;
		}
	}
	
	public void adicionarNaPosicao(Contato contato, int posicao){
		Contato controle = primeiro;
		int posicaoAtual = 0;
		while(controle!=null){
			if(posicao == posicaoAtual){
				contato.setProximo(controle.getProximo());
				controle.setProximo(contato);
			}
			posicaoAtual++;
			controle = controle.getProximo();
		}
	}
	
	public Contato remover(Contato contato){
		return null;
	}
	
	public void listar(){
		Contato controle = primeiro;
		while(controle!=null){
			System.out.println(controle.getPessoa());
			controle = controle.getProximo();
		}
	}
	
	public Contato buscarPorTelefone(String telefone){
		Contato controle = primeiro;
		while(controle!=null){
			if(telefone.equals(controle.getPessoa().getTelefone())){
				return controle;
			}
			controle = controle.getProximo();
		}
		return null;
	}

}
