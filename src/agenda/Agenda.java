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
				break;
			}
			posicaoAtual++;
			controle = controle.getProximo();
		}
	}
	
	public void removerPosicao(int posicao){
		Contato controle = primeiro;
		Contato anterior = new Contato();
		int posicaoAtual = 0;
		while(controle!=null){
			if(posicao == posicaoAtual){
				anterior.setProximo(controle.getProximo());
				break;
			}
			posicaoAtual++;
			anterior = controle;
			controle = controle.getProximo();
		}
	}
	public void removerFinal(){
		Contato controle = primeiro;
		Contato anterior = new Contato();
		while(controle!=null){
			if(controle.getProximo()!=null)
				anterior = controle;
			controle = controle.getProximo();
		}
		anterior.setProximo(null);
		auxiliar = anterior;
	}
	
	public Contato removerInicio(Contato contato){
		Pessoa pessoaPrimeiro = primeiro.getPessoa();
		Contato retorno = new Contato();
		contato.setPessoa(pessoaPrimeiro);
		
		primeiro = primeiro.getProximo();
		return retorno;
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
