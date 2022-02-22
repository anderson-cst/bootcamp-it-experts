package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double real = 0;
		double dolar = 0;
		double cotacaoDolar = 0;
		boolean continuar = true;
		String controle = null;
		
		do {
			
			System.out.println("Digite o valor em dólares para conversão:");
			dolar = input.nextDouble();
			
			System.out.println("Digite a cotação atual do dólar:");
			cotacaoDolar = input.nextDouble();
			
			real = dolar * cotacaoDolar;
			System.out.println("O valor convertido em Reais é : R$ "+ real);
			
			System.out.println("Quantidade de Dólares disponíveis: US$ "+ dolar);
			
			System.out.println("Deseja converter outro valor? | S | N |");
			controle = input.next();
			
			if ((controle.equals("N") || (controle.equals("n")))) {
				continuar = false;
				System.out.println("encerrado");
			}else
				System.out.println("ok\n");
			
		}while(continuar);
		
		input.close();

	}

}
