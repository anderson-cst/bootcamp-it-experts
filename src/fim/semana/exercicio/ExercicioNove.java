package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double valor = 0;
				
		System.out.println("Digite o valor de dep�sitado:");
		valor = input.nextDouble();
		
		valor += (valor)*(0.70/12);
		
		System.out.println("Valor total com rendimento de 1 m�s: R$ "+ valor);
		
		input.close();
	}
	

}
