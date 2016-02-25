package agenda;

public class AgendaDupla {

	private Contato primeiro;
	private Contato auxiliar;
	private Contato ponteiro;
	
	public void adicionarComeco(Contato contato){
		if(primeiro == null){
			primeiro = contato;
			auxiliar = contato;
			ponteiro = primeiro;
		}else{
			contato.setProximo(primeiro);
			primeiro.setAnterior(contato);//+
			primeiro = contato;
			ponteiro = primeiro;
		}
	}
	
	public void adicionarFim(Contato contato){
		if(primeiro == null){
			primeiro = contato;
			auxiliar = contato;
			ponteiro = contato;
		}else{
			//Adiciona no final
			contato.setAnterior(auxiliar); //+
			auxiliar.setProximo(contato);
			auxiliar = contato;
			
		}
	}
	
	public Contato getPonteiro() {
		return ponteiro;
	}
	
	public boolean avancar(){
		if(ponteiro.getProximo() == null){
			return false;
		}
		ponteiro = ponteiro.getProximo();
		return true;
	}
	public boolean anterior(){
		if(ponteiro.getAnterior()==null){
			return false;
		}
		ponteiro = ponteiro.getAnterior();
		return true;
	}
	
	public void vaParaComeco(){
		ponteiro = primeiro;
	}
	public void vaParaFim(){
		ponteiro = auxiliar;
	}
	
}
