package vetor;

public class ExemploVetor {

	public static void main(String[] args) {
		String[] nomes = new String[100];
		nomes[0] = "Romulo";
		nomes[90] = "Lucas";
		nomes[70] = "Ícaro";
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Pos "+i+" Nome: "+nomes[i]);
		}
		
		/*
		for(String d:nomes){
			System.out.println(d);
		}
		*/
		
		String[] nomes2 = {"Alfa","Beta"};
		System.out.println(nomes2[0]);
		System.out.println(nomes2.length);
		

	}

}
