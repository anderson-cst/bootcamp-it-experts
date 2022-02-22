package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheit = 0;
		boolean continuar = true;
		String controle = null;
		
		while (continuar) {
		
			System.out.println("Digite a temperatura em Celsius para conversão:");
			celsius = input.nextDouble();
		
			fahrenheit = (9*celsius+160)/5;
		
			System.out.println("A temperatura convertida em fahrenheit é: "+ fahrenheit+"\n");
			
			System.out.println("Converter outro numero? | S | N |");
			controle = input.next();
			
			if ((controle.equals("N") || (controle.equals("n")))) {
				continuar = false;
				System.out.println("encerrado");
			}else
				System.out.println("ok\n");
				
			
		}
		
		input.close();
	}

}
