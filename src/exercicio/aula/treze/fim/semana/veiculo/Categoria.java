package exercicio.aula.treze.fim.semana.veiculo;

public enum Categoria {
	
	BASICO(1, "B�sico"),
	INTERMEDIARIO(2, "Intermedi�rio"),
	EXECUTIVO(3, "Executivo"),
	PREMIUM(4, "Premium");
	
	private final Integer codigoCategoria;
	private final String categoriaPorExtenso;
	
	Categoria(Integer codigoCategoria, String categoriaPorExtenso){
		this.codigoCategoria = codigoCategoria;
		this.categoriaPorExtenso = categoriaPorExtenso;
	}

	public Integer getCodigoCategoria() {
		return codigoCategoria;
	}

	public String getCategoriaPorExtenso() {
		return categoriaPorExtenso;
	}	

}
