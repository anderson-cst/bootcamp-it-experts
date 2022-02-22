package exercicio.aula.tres;
import java.util.Scanner;

public class aposentadoria {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o c�digo de funcion�rio:");
		int codigo = input.nextInt();
		
		System.out.println("Digite o nome do funcion�rio:");
		String nome = input.next();
		
		System.out.println("Digite o genero do funcion�rio: | M | F | O |");
		String genero = input.next();
		
		System.out.println("Digite o ano de nascimento do funcion�rio:");
		int anoNascimento = input.nextInt();
		
		System.out.println("Digite o ano de contrata��o do funcion�rio:");
		int anoContratacao = input.nextInt();
		
		int idade = 2022 - (anoNascimento);
		int tempoTrabalho = 2022 - (anoContratacao);
		
		switch (genero) {
			case ("M"):
				System.out.println("Genero Masculino");
				if ((idade >= 65) || (tempoTrabalho >= 30)) {
					System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", Requerer Aposentadoria");
				}else System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", N�o Requerer");
			break;
			
			case ("F"):
				System.out.println("Genero Feminino");
				if ((idade >= 60) && (tempoTrabalho >= 25)) {
					System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", Requerer Aposentadoria");
				}else System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", N�o Requerer");
			break;
			
			case ("O"):
				System.out.println("Genero Outros");
				if ((idade >= 60) && (tempoTrabalho >= 25) || (idade >= 65) || (tempoTrabalho >= 30)){
					System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", Requerer Aposentadoria");
				}else System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", N�o Requerer");
			break;
			
			default:
				System.out.println("Genero Inv�lido");
			
		}input.close();
	}

}
