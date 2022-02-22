package exercicio.aula.tres;
import java.util.Scanner;

public class aposentadoria {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o código de funcionário:");
		int codigo = input.nextInt();
		
		System.out.println("Digite o nome do funcionário:");
		String nome = input.next();
		
		System.out.println("Digite o genero do funcionário: | M | F | O |");
		String genero = input.next();
		
		System.out.println("Digite o ano de nascimento do funcionário:");
		int anoNascimento = input.nextInt();
		
		System.out.println("Digite o ano de contratação do funcionário:");
		int anoContratacao = input.nextInt();
		
		int idade = 2022 - (anoNascimento);
		int tempoTrabalho = 2022 - (anoContratacao);
		
		switch (genero) {
			case ("M"):
				System.out.println("Genero Masculino");
				if ((idade >= 65) || (tempoTrabalho >= 30)) {
					System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", Requerer Aposentadoria");
				}else System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", Não Requerer");
			break;
			
			case ("F"):
				System.out.println("Genero Feminino");
				if ((idade >= 60) && (tempoTrabalho >= 25)) {
					System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", Requerer Aposentadoria");
				}else System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", Não Requerer");
			break;
			
			case ("O"):
				System.out.println("Genero Outros");
				if ((idade >= 60) && (tempoTrabalho >= 25) || (idade >= 65) || (tempoTrabalho >= 30)){
					System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", Requerer Aposentadoria");
				}else System.out.println("Idade: "+idade+", tempo de trabalho: "+tempoTrabalho+", Não Requerer");
			break;
			
			default:
				System.out.println("Genero Inválido");
			
		}input.close();
	}

}
