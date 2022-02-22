package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int valorUm = 0;
		int valorDois = 0;
		
		System.out.println("Digite o primeiro valor:");
		valorUm = input.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valorDois = input.nextInt();
		
		if (valorUm == valorDois) {
			System.out.println("Os dois valores são iguais");
		}else if (valorUm > valorDois) {
			System.out.println("Primeiro valor: "+ valorUm +", é maior que o segundo");
		}else System.out.println("Segundo valor: "+ valorDois +", é maior que o primeiro");
	input.close();
	}

}
