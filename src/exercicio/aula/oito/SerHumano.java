package exercicio.aula.oito;

public abstract class SerHumano extends Pessoa {
	
	private int idade;
	
	public abstract boolean habilitadoTrabalhar(boolean possuiCarteiraDeTrabalho, int idade);
	
	@Override
	public boolean andar(int idade){
				
		if (idade > 1) {
			return true;
		}return false;
					
	}
	
	@Override
	public boolean falar(int idade){
		
		if (idade > 3) {
			return true;
		}return false;
	}

}
