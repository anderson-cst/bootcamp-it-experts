package exercicio.aula.quinze.fim.semana.filme;

public class Filme {
	
	private String titulo;
	private String nomeDiretor;
	private String genero;
	private String uf;
	private Integer duracaoMinutos;
	private Integer anoLancamento;
	private Integer classificacao;
	private Integer totalPublico;
	private String sinopse;
	
	public Filme() {
		
	}
	
	public Filme(String titulo, String nomeDiretor, String genero, String uf, Integer duracaoMinutos, Integer anoLancamento,
			Integer classificacao, Integer totalPublico, String sinopse) {
		this.titulo = titulo;
		this.nomeDiretor = nomeDiretor;
		this.genero = genero;
		this.uf = uf;
		this.duracaoMinutos = duracaoMinutos;
		this.anoLancamento = anoLancamento;
		this.classificacao = classificacao;
		this.totalPublico = totalPublico;
		this.sinopse = sinopse;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getNomeDiretor() {
		return nomeDiretor;
	}


	public void setNomeDiretor(String nomeDiretor) {
		this.nomeDiretor = nomeDiretor;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public Integer getDuracaoMinutos() {
		return duracaoMinutos;
	}


	public void setDuracaoMinutos(Integer duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}


	public Integer getAnoLancamento() {
		return anoLancamento;
	}


	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}


	public Integer getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}


	public Integer getTotalPublico() {
		return totalPublico;
	}


	public void setTotalPublico(Integer totalPublico) {
		this.totalPublico = totalPublico;
	}


	public String getSinopse() {
		return sinopse;
	}


	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}


	@Override
	public String toString() {
		return "Filme [nome=" + titulo + ", nomeDiretor=" + nomeDiretor + ", categoria=" + genero + 
				", duracao=" + duracaoMinutos + ", anoLancamento=" + anoLancamento + ", classificacao="
				+ classificacao + ", qtPublico=" + totalPublico + "]";
	}
	
	

}
