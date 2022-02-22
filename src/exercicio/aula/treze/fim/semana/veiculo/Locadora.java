package exercicio.aula.treze.fim.semana.veiculo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Locadora extends Clientes {
	
	
	

	public static void main(String[] args) {
		
		Servico servico = new Servico();
			
	
		servico.aplicacao();
		
		
	}
	
	
	
	
	private Integer id;
	private int diasAlugados;
	private double valoresPagar;

		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDiasAlugados() {
		return diasAlugados;
	}

	public void setDiasAlugados(int diasAlugados) {
		this.diasAlugados = diasAlugados;
	}

	public double getValoresPagar() {
		return valoresPagar;
	}

	public void setValoresPagar(double valoresPagar) {
		this.valoresPagar = valoresPagar;
	}	


	@Override
	public String toString() {
		return "Locadora [id=" + id + ", diasAlugados=" + diasAlugados + ", valoresPagar=" + valoresPagar + "]";
	}
	

	public void valoresPagar(double valorDiaria) {
		double calculoPagar;
				
		calculoPagar = (this.getDiasAlugados() * valorDiaria);
		this.setValoresPagar(calculoPagar);
				
	}
	
		

}
