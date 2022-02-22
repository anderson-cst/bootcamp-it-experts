package exercicio.aula.cinco;

import java.util.Scanner;

public class ArraySaidaS {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		String alunos = null;
		double[] notas = new double[4];
		String saida = null;
		double media =0;
		
		do {
			
			media = 0;
			System.out.println("Digite o nome do aluno:");
			alunos = leitor.next();
			
			for (int i=0; i < 4; i++) {
				
				System.out.println("Digite a "+(i+1)+"ª nota do aluno:");
				notas[i] = leitor.nextDouble();
				
				media += notas[i];
						
			}
			media = media/4;
			
			System.out.println("O aluno "+alunos+" teve a média "+media+"\n");
			
			System.out.println("Pressione qualquer tecla para continuar para sair | S | ou | s |\n");
			saida = leitor.next();
			
			
		} while (!(saida.equals("S") || (saida.equals("s"))));
		
		System.out.println("Encerrado");
		
		leitor.close();
	}

}
