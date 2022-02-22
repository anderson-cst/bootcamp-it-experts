package exercicio.aula.dez;

public enum ResultadoImc {
	
	MAGREZA(1, "Magreza"),
	NORMAL(2, "Normal"),
	SOBREPESO(3, "Sobrepeso"),
	OBESIDADE(4, "Obesidade");

	private final int numeroImc;
	private final String imcPorExtenso;
	
	ResultadoImc(int numeroImc, String imcPorExtenso){
		this.numeroImc = numeroImc;
		this.imcPorExtenso = imcPorExtenso;
	}
	

	public int getNumeroImc() {
		return numeroImc;
	}

	public String getImcPorExtenso() {
		return imcPorExtenso;
	}
	
	
	
}
