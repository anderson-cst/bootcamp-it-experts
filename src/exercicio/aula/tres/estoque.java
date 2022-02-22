package exercicio.aula.tres;
import java.util.Scanner;

public class estoque {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o estoque atual do produto:");
		int estoqueAtual = input.nextInt();
		
		System.out.println("Digite o estoque máximo do produto:");
		int estoqueMax = input.nextInt();
		
		System.out.println("Digite o estoque mínimo do produto:");
		int estoqueMin = input.nextInt();
		
		int estoqueMedia = (estoqueMax + estoqueMin)/2;
		
		if(estoqueAtual >= estoqueMedia) {
			System.out.println("Não efetuar compra");
		}else {
			System.out.println("Efetuar compra");
		}

	}

}
