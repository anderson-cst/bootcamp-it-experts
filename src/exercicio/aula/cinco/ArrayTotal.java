package exercicio.aula.cinco;

import java.util.Scanner;

public class ArrayTotal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int tamanho = 0;
		
		System.out.println("Qual o tamanho do array:");
		tamanho = leitor.nextInt();
		
		int[] valor = new int[tamanho];
		int menor = 0;
		int total = 0;
		String valorExibir = null;
		int indice = 0;
													
		for (int i=0; i < valor.length; i++) {
			
			valorExibir += ",";
			
			System.out.println("Digite o "+(i+1)+"º para o array");
			valor[i] = leitor.nextInt();
			
			if (i == 0) {
				menor = valor[i];
				indice = i;
				valorExibir = "";
			}
			if (valor[i] < menor) {
				menor = valor[i];
				indice = i;
			}
						
			total += valor[i];
			valorExibir += valor[i];
												
		}
		
		System.out.println("Tamanho do vetor: "+tamanho+"\n");
		System.out.println("Valores do array: "+valorExibir+"\n");
		System.out.println("Menor numero é: "+menor+", indice "+indice+" do array\n");
		System.out.println("Soma total do vetor: "+total+"\n");
		
		
		leitor.close();

	}

}
