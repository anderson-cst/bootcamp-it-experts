package exercicio.aula.quatro;
import java.util.Scanner;

public class SomaLaco {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int valor = 0;
		int soma = 0;
		
		do {
			
			System.out.println("Digite um valor:");
			valor = input.nextInt();
			soma = soma + valor;
			
		} while (valor !=0);
		
		System.out.println(soma);
		
		input.close();
	}

}
