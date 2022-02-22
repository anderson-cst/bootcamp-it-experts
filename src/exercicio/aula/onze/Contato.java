package exercicio.aula.onze;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Contato {
	
	private Integer id;
	private String nome;
	private String sobreNome;
	private Integer idade;
	private Genero genero;
	
	
	public Contato(Integer id, String nome, String sobreNome, Integer idade, Genero genero) {
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.genero = genero;
	}
	
	
	
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

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}



	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + ", genero="
				+ genero + "]";
	}
	
	
	public List<Contato> aplicacao() {
		Integer escolha;
		Integer id;
		String nome;
		String sobreNome;
		Integer idade;
		Integer escolhaGenero;
		Genero genero = null;
		
		List<Contato> listaContato = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Quantos contatos deseja inserir:");
		escolha = sc.nextInt();
		
		Contato contato = null;
		
		for (int i = 0; i < escolha; i++) {
			System.out.println("Digite o id:");
			id = sc.nextInt();
			System.out.println("Digite o nome:");
			nome = sc.next();
			System.out.println("Digite o sobrenome:");
			sobreNome = sc.next();
			System.out.println("Digite o idade:");
			idade = sc.nextInt();
			do {
				System.out.println("Digite o genero | 1 - Masculino | 2 - Feminino | 3 - Outros |");
				escolhaGenero = sc.nextInt();
				
				switch (escolhaGenero) {
					case 1:
						genero = Genero.MASCULINO;
					break;
					
					case 2:
						genero = Genero.FEMININO;
					break;
					
					case 3:
						genero = Genero.OUTROS;
					break;
					
					default: 
						System.out.println("Digite uma das opções válidas");
				}
			}while (escolhaGenero > 3);
			
			contato = new Contato(id, nome, sobreNome, idade, genero);
			listaContato.add(contato);
		}
		
		
		/*
		 * Iterator<Contato> iterator = listaContato.iterator();
		 * 
		 * while (iterator.hasNext()) { 
		 * Contato element = iterator.next();
		 * System.out.println(element); }
		 * 
		 * for (Contato value : listaContato) { 
		 * System.out.println(value); }
		 * 
		 * for (int i = 0; i < listaContato.size(); i++) {
		 * System.out.println("indice = "+i+" - "+listaContato.get(i)); }
		 */
		
		return listaContato;
		
		
		
		
	}
	

}
