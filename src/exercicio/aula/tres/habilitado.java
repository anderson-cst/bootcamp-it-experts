package exercicio.aula.tres;
import java.util.Scanner;

public class habilitado {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = leitor.next();
		System.out.println("Digite sua idade:");
		int idade = leitor.nextInt();
		System.out.println("Você é habilitado? | sim | não");
		String habilitado = leitor.next();
		
		
		if (idade > 17 && habilitado.equals("sim")) {
			System.out.println("Liberação realizada para "+ nome);
		}else {
			System.out.println("O cliente "+ nome +" não atende a todos os requisitos obrigatórios");
		}
		

	}

}
