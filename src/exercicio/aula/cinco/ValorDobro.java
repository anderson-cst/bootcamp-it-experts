package exercicio.aula.cinco;

import java.util.Scanner;

public class ValorDobro {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int tamanho = 0;
		
		System.out.println("Qual o tamanho do array:");
		tamanho = leitor.nextInt();
		
		int[] valor = new int[tamanho];
		int[] valorDobro = new int[tamanho];
													
		for (int i=0; i < valor.length; i++) {
			
			System.out.println("Digite o "+(i+1)+"º para o array");
			valor[i] = leitor.nextInt();
			
			valorDobro[i] = valor[i]*2;
									
		}
		
		System.out.println("vetor de "+tamanho+" posições");
		for (int i = 0; i < valor.length; i++) {
			System.out.println(valor[i]);
		}
		
		System.out.println("vetor de "+tamanho+" posições em dobro");
		for (int i = 0; i < valorDobro.length; i++) {
			System.out.println(valorDobro[i]);
		}
		
		leitor.close();

	}

}
