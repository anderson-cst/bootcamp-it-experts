package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double valorUm = 0;
		double valorDois = 0;
		double resultado = 0;
		
		System.out.println("Digite o primeiro valor:");
		valorUm = input.nextInt();
		
		System.out.println("Digite o segundo valor:");
		valorDois = input.nextInt();
		
		resultado = valorUm + valorDois;
		System.out.println("A soma de: "+ valorUm +" + "+valorDois +" = "+ resultado);
		
		resultado = valorUm - valorDois;
		System.out.println("A subtra��o de: "+ valorUm +" - "+valorDois +" = "+ resultado);
		
		resultado = valorUm / valorDois;
		System.out.println("A divis�o de: "+ valorUm +" / "+valorDois +" = "+ resultado);
		
		resultado = valorUm * valorDois;
		System.out.println("A multuplica��o de: "+ valorUm +" * "+valorDois +" = "+ resultado);
	
		input.close();
	}

}
