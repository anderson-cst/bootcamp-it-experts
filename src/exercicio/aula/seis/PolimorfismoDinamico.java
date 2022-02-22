package exercicio.aula.seis;

public class PolimorfismoDinamico {

	public static void main(String[] args) {

		mensagem(new ContaFisica());
		mensagem(new ContaJuridica());
			
		ContaFisica AndersonPF = new ContaFisica();
		ContaJuridica AndersonPJ = new ContaJuridica();
		
		mensagem(AndersonPF);
		mensagem(AndersonPJ);
		
		PolimorfismoDinamico.mensagem(new ContaFisica());
						
	}
	
	//public void mensagem(ContaFisica conta) {
	//	conta.exibir();
	//}
	
	static void mensagem(Conta conta) {
		conta.exibir();
	}

}
