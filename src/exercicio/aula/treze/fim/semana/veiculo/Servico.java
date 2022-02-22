package exercicio.aula.treze.fim.semana.veiculo;

import java.util.*;

public class Servico {
	
	public void aplicacao() {
		
		int veiculoAlugado;
		int diasAluguel;
		int escolhaFor;
		String escolhawhile = "s";
		Integer id;
		String nome;
		Integer idade;
		int contador=0;
		
		List<Clientes> listaClientes = new ArrayList<>();
		List<Veiculos> listaVeiculos = new ArrayList<>();
		List<Locadora> faturaPagar = new ArrayList<>();
		
		listaVeiculos = preencheListaVeiculos();
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Quantos clientes deseja cadastrar?");
		escolhaFor = sc.nextInt();
		
		Clientes clientes = null;
		Locadora locadora;
		
		for (int i = 0; i < escolhaFor; i++) {
			System.out.println("Digite o id do cliente:");
			id = sc.nextInt();
			System.out.println("Digite o nome do cliente:");
			nome = sc.next();			
			System.out.println("Digite o idade do cliente:");
			idade = sc.nextInt();
						
			clientes = new Clientes();
			clientes.setId(id);
			clientes.setNome(nome);
			clientes.setIdade(idade);
						
			
			int count = 0;
			do {
				
				System.out.println("Digite o número do veículo que deseja alugar?\n");
				System.out.println("BÁSICO:\n");
				System.out.println("       1 - " + listaVeiculos.get(0));
				System.out.println("       2 - " + listaVeiculos.get(1) + "\n");
				System.out.println("INTERMEDIÁRIO:\n");
				System.out.println("       3 - " + listaVeiculos.get(2));
				System.out.println("       4 - " + listaVeiculos.get(3) + "\n");
				System.out.println("EXECUTIVO:\n");
				System.out.println("       5 - " + listaVeiculos.get(4));
				System.out.println("       6 - " + listaVeiculos.get(5) + "\n");
				System.out.println("PREMIUM:\n");
				System.out.println("       7 - " + listaVeiculos.get(6));
				System.out.println("       8 - " + listaVeiculos.get(7) + "\n");
				veiculoAlugado = sc.nextInt();
				
				System.out.println("Por quantos dias deseja alugar o veículo?");
				diasAluguel = sc.nextInt();
				System.out.println("Deseja alugar outro veículo? - | S | N |");
				escolhawhile = sc.next();
				
				clientes.addVeiculo(listaVeiculos.get(veiculoAlugado-1));
				clientes.inserirVeiculoAlugado();
				clientes.setDiasAluguel(diasAluguel);
				clientes.calculaAluguel(listaVeiculos.get(veiculoAlugado-1));
				listaClientes.add(clientes);
								
				locadora = new Locadora();
				locadora.setId(id);
				locadora.setDiasAlugados(diasAluguel);
				locadora.valoresPagar(clientes.listaVeiculosAlugados.get(count).getPrecoAluguel());
				
				faturaPagar.add(locadora);
				
				count++;
				
			}while(!escolhawhile.equalsIgnoreCase("n"));
			
			
		}
		
		Integer pesquisa;
		System.out.println("Digite id para pesquisa");
		pesquisa = sc.nextInt();
		
				
		for (Clientes c : listaClientes) {
            if (c.getId().equals(pesquisa)) {
                
                System.out.println("Nome: " + c.getNome());
                System.out.println("Idade: " + c.getIdade());
                System.out.println("resumo ");
                
                for (Veiculos v : listaClientes.get(pesquisa).listaVeiculosAlugados) {
                	System.out.println("Alugou por "+listaClientes.get(pesquisa).getDiasAluguel()+" na categoria "+v.getCategoria()+" "+v.getNome()+" "+v.getModelo()+" "+v.getPrecoAluguel());
                	System.out.println("Valor total do aluguel "+listaClientes.get(pesquisa).getTotalPagar());
                }
		
            }
            }
				
	}
	
	public void teste() {
		
		
	}
	
	public List<Veiculos> preencheListaVeiculos() {
				
		Veiculos veiculosA = new Veiculos("Fiat Uno", "Way", "preto", 1.0, 130.00, Categoria.BASICO.getCategoriaPorExtenso());
		Veiculos veiculosB = new Veiculos("VW Gol", "G3", "branco", 1.0, 150.00, Categoria.BASICO.getCategoriaPorExtenso());
		Veiculos veiculosC = new Veiculos("Jeep Renegade", "std AT", "preto", 1.8, 350.00, Categoria.INTERMEDIARIO.getCategoriaPorExtenso());
		Veiculos veiculosD = new Veiculos("Renault Duster", "Dynamique", "branco", 1.6, 350.00, Categoria.INTERMEDIARIO.getCategoriaPorExtenso());
		Veiculos veiculosE = new Veiculos("Toyota Hilux", "SW4", "preto", 3.0, 1500.00, Categoria.EXECUTIVO.getCategoriaPorExtenso());
		Veiculos veiculosF = new Veiculos("GM TrailBlazer", "LTZ", "branco", 3.0, 1800.00, Categoria.EXECUTIVO.getCategoriaPorExtenso());
		Veiculos veiculosG = new Veiculos("Porshe Cayenne", "Turbo GT", "preto", 4.0, 3500.00, Categoria.PREMIUM.getCategoriaPorExtenso());
		Veiculos veiculosH = new Veiculos("Ford Mustang", "Mach 1", "branco", 5.0, 4000.00, Categoria.PREMIUM.getCategoriaPorExtenso());
		
		List<Veiculos> listaExibeVeiculos = new ArrayList<>();
		
		listaExibeVeiculos.add(veiculosA);
		listaExibeVeiculos.add(veiculosB);
		listaExibeVeiculos.add(veiculosC);
		listaExibeVeiculos.add(veiculosD);
		listaExibeVeiculos.add(veiculosE);
		listaExibeVeiculos.add(veiculosF);
		listaExibeVeiculos.add(veiculosG);
		listaExibeVeiculos.add(veiculosH);
		
		return listaExibeVeiculos;
	}
	
	
	
	
	
	
	
	

}
