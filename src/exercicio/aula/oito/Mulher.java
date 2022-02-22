package exercicio.aula.oito;

public class Mulher extends SerHumano {
	
	private String nome;
	private int idade;
	private boolean possuiCarteiraDeTrabalho;
		
	
	public Mulher() {
	}
	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isPossuiCarteiraDeTrabalho() {
		return possuiCarteiraDeTrabalho;
	}

	public void setPossuiCarteiraDeTrabalho(boolean possuiCarteiraDeTrabalho) {
		this.possuiCarteiraDeTrabalho = possuiCarteiraDeTrabalho;
	}


	@Override
	public boolean habilitadoTrabalhar(boolean possuiCarteiraDeTrabalho, int idade) {
		
		if ((andar(idade) == true) && (falar(idade) == true) && possuiCarteiraDeTrabalho == true) {
			return true;
		}return false;
	}
}


