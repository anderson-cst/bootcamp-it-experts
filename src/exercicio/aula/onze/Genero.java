package exercicio.aula.onze;

public enum Genero {

	MASCULINO(1, "Masculino"),
	FEMININO(2, "Feminino"),
	OUTROS(3, "Outros");
	
	private final int codigoGenero;
	private final String generoPorExtenso;
	
	Genero(int codigoGenero, String generoPorExtenso) {
		this.codigoGenero = codigoGenero;
		this.generoPorExtenso = generoPorExtenso;
	}

	public int getCodigoGenero() {
		return codigoGenero;
	}

	public String getGeneroPorExtenso() {
		return generoPorExtenso;
	}
	
	
}
