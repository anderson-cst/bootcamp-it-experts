package exercicio.aula.tres;
import java.util.Scanner;

public class mercado {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = leitor.next();
		System.out.println("Digite seu sobrenome:");
		String sobrenome = leitor.next();
		System.out.println("Digite seu RG:");
		int rg = leitor.nextInt();
		
		System.out.printf("Bem vindo " + nome +" "+ sobrenome);
		System.out.println("\n");
		System.out.println("Você é portador do RG "+ rg +"?");
		String valida = leitor.next();		
		
		if (valida.equals("sim")) {
			System.out.println("Perfeito boas compras");
		}else {
			System.out.println("Sinto muito desconto não autorizado!");
		}

	}

}
