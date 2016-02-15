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
			auxiliar.setProximo(contato);
			auxiliar = contato;
		}
	}
	
	public Contato remover(Contato contato){
		return null;
	}
	
	public void listar(){
		
	}
	
	public Contato buscarPorTelefone(String telefone){
		return null;
	}

}
