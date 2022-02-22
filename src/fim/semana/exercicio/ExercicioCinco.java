package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome[] = new String[10];
		int matricula[] = new int[10];
		double[][] nota = new double[10][4];
		double[] mediaControle = new double[10];
		double mediaMaior = 0;
		double mediaMenor = 0;
		double mediaSoma =0;
						
		
		for (int i=0; i<10; i++) {
			
			System.out.println("Digite o nome do aluno(a):");
			nome[i] = input.next();
			
			System.out.println("Digite a matrícula do aluno(a):");
			matricula[i] = input.nextInt();
			
			mediaSoma = 0;
			
			
				for (int j=0; j < 4; j++) {
				
					System.out.println("Digite a nota da "+(j+1)+"ª prova:");
					nota[i][j] = input.nextDouble();					
					
					mediaSoma += nota[i][j];
												
				}
				
				mediaControle[i] = mediaSoma / 4;
				
				if (i == 0) {
					mediaMaior = mediaControle[i];
					mediaMenor = mediaControle[i];
				}
				if (mediaControle[i] > mediaMaior) {
					mediaMaior = mediaControle[i];
				}
				if (mediaControle[i] < mediaMenor) {
					mediaMenor = mediaControle[i];
				}
		}
		
		for (int i=0; i < 10; i++) {
			if (mediaMaior == mediaControle[i]) {
				
				System.out.println("aluno(a): "+nome[i]+", teve a maior média com: "+ mediaMaior);
				
				if (mediaMaior>=7) {
					System.out.println("aluno(a): "+nome[i]+", matrícula "+matricula[i]+", foi aprovado com média: "+ mediaMaior+"\n");
				}else if ((mediaMaior >= 4) && (mediaMaior < 7)) {
					System.out.println("Aluno(a): "+nome[i]+", matrícula "+matricula[i]+", ficou de recuperação com média: "+ mediaMaior+"\n");
				}else if (mediaMaior <4) {
					System.out.println("Aluno(a): "+nome[i]+", matrícula "+matricula[i]+",foi reprovado com média: "+ mediaMaior+"\n");
			    }
				
				for (int j=0; j < 4; j++) {
					
					System.out.println("A "+(j+1)+"ª nota foi: "+nota[i][j]);
				}
				
				System.out.println("Divido por 4 é igual: "+mediaMaior+"\n");
			}
		 }
				
				
		 for (int i =0; i < 10; i++) {
			 
			 if (mediaMenor == mediaControle[i]) {
					
				 System.out.println("aluno(a): "+nome[i]+", teve a menor média com: "+ mediaMenor);
				
				 if (mediaMenor>=7) {
						System.out.println("aluno(a): "+nome[i]+", matrícula "+matricula[i]+", foi aprovado com média: "+ mediaMenor+"\n");
				 }else if ((mediaMenor >= 4) && (mediaMenor < 7)) {
						System.out.println("Aluno(a): "+nome[i]+", matrícula "+matricula[i]+", ficou de recuperação com média: "+ mediaMenor+"\n");
				 }else if (mediaMenor <4) {
						System.out.println("Aluno(a): "+nome[i]+", matrícula "+matricula[i]+",foi reprovado com média: "+ mediaMenor+"\n");
				 }
				 
				 for (int j=0; j < 4; j++) {
						
					 System.out.println("A "+(j+1)+"ª nota foi: "+nota[i][j]);
											
				}
					
					System.out.println("Divido por 4 é igual: "+mediaMenor+"\n");
			 								
			}
						
		  }
	input.close();		
	}
}





