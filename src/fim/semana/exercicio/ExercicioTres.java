package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double distancia = 0;
		double combustivel = 0;
		double consumo = 0;
		
		System.out.println("Digite a dist�ncia percorrida pelo autom�vel:");
		distancia = input.nextDouble();
		
		System.out.println("Digite a quantidade de combust�vel usada no percurso:");
		combustivel = input.nextDouble();
		
		consumo = distancia / combustivel;
		System.out.println("O consumo m�dio do autom�vel �: "+ consumo +" km por litro");		
		
		input.close();
	}

}
