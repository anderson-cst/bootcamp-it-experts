package exercicio.aula.treze.fim.semana.veiculo;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
	
	private Integer id;
	private String nome;
	private Integer idade;
	private Veiculos veiculos;
	private Double totalPagar;
	private Integer diasAluguel;
	List<Veiculos> listaVeiculosAlugados = new ArrayList<>();
		
	

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Veiculos getVeiculo() {
		return veiculos;
	}
	
	public void addVeiculo(Veiculos veiculos) {
		this.veiculos = veiculos;
	}	

	public Double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(Double totalPagar) {
		this.totalPagar = totalPagar;
	}	

	public Integer getDiasAluguel() {
		return diasAluguel;
	}

	public void setDiasAluguel(Integer diasAluguel) {
		this.diasAluguel = diasAluguel;
	}
	

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nome=" + nome + ", idade=" + idade + " - veiculos "+ listaVeiculosAlugados.toString()+"]";
	}
	
	public void inserirVeiculoAlugado() {
		listaVeiculosAlugados.add(getVeiculo());	
	}
	
	public void calculaAluguel(Veiculos veiculos) {
		this.totalPagar = this.diasAluguel * veiculos.getPrecoAluguel();
	}
	
	

}
