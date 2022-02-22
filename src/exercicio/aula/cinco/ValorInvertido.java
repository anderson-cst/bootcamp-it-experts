package exercicio.aula.cinco;

import java.util.Scanner;

public class ValorInvertido {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int tamanho = 0;
		
		System.out.println("Qual o tamanho do array:");
		tamanho = leitor.nextInt();
		
		int[] valorUm = new int[tamanho];
		int[] valorDois = new int[tamanho];
		int contJ = tamanho-1;
											
		for (int i=0; i < valorUm.length; i++) {
			
			System.out.println("Digite o "+(i+1)+"º para o array");
			valorUm[i] = leitor.nextInt();
			
			valorDois[contJ] = valorUm[i];
			
			contJ--;			
		}
		
		System.out.println("vetor de "+tamanho+" posições");
		for (int i = 0; i < valorUm.length; i++) {
			System.out.println(valorUm[i]);
		}
		
		System.out.println("vetor de "+tamanho+" posições invertido");
		for (int i = 0; i < valorDois.length; i++) {
			System.out.println(valorDois[i]);
		}
		
		leitor.close();
	}

}
