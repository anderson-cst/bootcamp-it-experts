package exercicio.aula.cinco;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int vetorSoma[] = new int[3];
		String vetorExibir[] = new String[3];
		int soma = 0;
		String exibir = null;
		
		for (int i = 0; i < 3; i++) {
			
			soma = 0;
								
			for (int j = 0; j < 3; j++) {
				
				exibir += ",";
				
				if (j == 0) {
					exibir = "";
				}
												
				System.out.println("Insira o valor:");
				matriz[i][j] = leitor.nextInt();
				
				soma += matriz[i][j];	
				
				exibir += matriz[i][j];								
			}
			
			vetorSoma[i] = soma;
			vetorExibir[i] = exibir;
						
		}
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("| "+vetorExibir[i]+" |    |"+vetorSoma[i]);
		}
		
		leitor.close();

	}

}
