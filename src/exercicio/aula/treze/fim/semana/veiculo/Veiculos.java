package exercicio.aula.treze.fim.semana.veiculo;

public class Veiculos {
	
	private String nome;
	private String modelo;
	private String cor;
	private Double motor;
	private Double precoAluguel;
	private String categoria;
	
	
	public Veiculos(String nome, String modelo, String cor, Double motor, Double precoAluguel, String categoria) {
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.precoAluguel = precoAluguel;
		this.categoria = categoria;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getMotor() {
		return motor;
	}

	public void setMotor(Double motor) {
		this.motor = motor;
	}

	public Double getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(Double precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Veiculo: " + nome + " - Modelo " + modelo + " - Motor " + motor + " - Cor " + cor +" - Valor do Aluguel "
				+ precoAluguel + "";
	}
}
