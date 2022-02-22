package exercicio.aula.quatro;
import java.util.Scanner;

public class Milhas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int entrada = 0;
		double km = 1609;
		
		System.out.println("Digite a quantidade de milhas: ");
		entrada = input.nextInt();
		
		System.out.println("Milhas            Quilômetros");
		System.out.println("-----------------------------");
		
		for (int i = 1; i <= entrada; i++) {
			System.out.println(i+"                 "+(km*i));
		}
		
		input.close();
	}

}
