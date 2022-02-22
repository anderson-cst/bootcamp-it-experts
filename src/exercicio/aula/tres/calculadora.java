package exercicio.aula.tres;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int numeroUm = sc.nextInt();
		
		System.out.println("Digite a operação que deseja realizar: | + | - | / | * |");
		String operador = sc.next();
		
		System.out.println("Digite o segundo numero:");
		int numeroDois = sc.nextInt();
		
		int resultado = 0;
		
		switch (operador) {
			case ("+"):
				resultado = numeroUm + numeroDois;
				System.out.println(numeroUm +" + "+numeroDois +" = "+ resultado);
			break;
			
			case ("-"):
				resultado = numeroUm - numeroDois;
				System.out.println(numeroUm +" - "+numeroDois +" = "+ resultado);
			break;
			
			case ("/"):
				resultado = numeroUm / numeroDois;
				System.out.println(numeroUm +" / "+numeroDois +" = "+ resultado);
			break;
			
			case ("*"):
				resultado = numeroUm * numeroDois;
				System.out.println(numeroUm +" * "+numeroDois +" = "+ resultado);
			break;
			
			default:
				System.out.println("Operador Inválido!");
		}

	}

}
