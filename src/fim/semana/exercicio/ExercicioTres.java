package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double distancia = 0;
		double combustivel = 0;
		double consumo = 0;
		
		System.out.println("Digite a distância percorrida pelo automóvel:");
		distancia = input.nextDouble();
		
		System.out.println("Digite a quantidade de combustível usada no percurso:");
		combustivel = input.nextDouble();
		
		consumo = distancia / combustivel;
		System.out.println("O consumo médio do automóvel é: "+ consumo +" km por litro");		
		
		input.close();
	}

}
