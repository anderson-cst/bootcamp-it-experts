package exercicio.aula.dez;

import java.util.Scanner;

public class Avaliador extends Estudante{
	
	private int id;
	
	private int escolha;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double calcularMedia(double ... notasArray) {
		
		double media = 0;
		
		for(double notas : notasArray) {
			media += notas;			
		}
		media = media / 4;
		return media;
	}
	
	public double[] cadastrarNotas() {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[4];
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite a nota "+(i+1));
			notas[i] = sc.nextDouble();			
		}						
		return notas;
	}
			
	public void aplicacao() {
		Scanner sc = new Scanner(System.in);				
		int i=0;		
		System.out.println("Quantos alunos deseja cadastrar?");
		escolha = sc.nextInt();
		double[] media = new double[escolha];
		Estudante[] estudante = new Estudante[escolha];
		
		
		do {
						
			System.out.println("Digite o id:");
			int id = sc.nextInt();				
			System.out.println("Digite o nome:");
			String nome = sc.next();
			System.out.println("Digite o idade:");
			int idade = sc.nextInt();
			
			estudante[i] = new Estudante();
			estudante[i].setId(id);
			estudante[i].setNome(nome);
			estudante[i].setIdade(idade);
			media[i] = calcularMedia(cadastrarNotas());
			estudante[i].setMedia(media[i]);
			
			i++;
		}while (i < escolha);
				
		System.out.println((estudante[0].getMedia() > estudante[1].getMedia()) ?
				("Aluno com média maior: Id: "+estudante[0].getId()+" Nome: "+estudante[0].getNome()+" Idade: "+estudante[0].getIdade()+" Média:"+estudante[0].getMedia()) : 
				("Aluno com média maior: Id: "+estudante[1].getId()+" Nome: "+estudante[1].getNome()+" Idade: "+estudante[1].getIdade()+" Média:"+estudante[1].getMedia()));
	}	
}
