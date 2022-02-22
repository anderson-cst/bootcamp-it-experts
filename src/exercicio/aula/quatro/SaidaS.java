package exercicio.aula.quatro;
import java.util.Scanner;

public class SaidaS {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String nome = null;
		String nomeMaiorIdade = null;
		String saida = null;
		int idade = 0;
		int maiorIdade = 0;
		double somaIdades = 0;
		double mediaIdades = 0;
		int i = 1;
		
		do {
						
			System.out.println("Digite o nome:");
			nome = input.next();
			
			System.out.println("Digite a idade:");
			idade = input.nextInt();
			
			
			
			if (idade > maiorIdade) {
				maiorIdade = idade;
				nomeMaiorIdade = nome;
			}
			
			somaIdades += idade;
			mediaIdades = somaIdades / i;
			i++;
			
			System.out.println("Digite a palavra chave para sair:");
			saida = input.next();
			
		} while (!(saida.equals("S") || (saida.equals("s"))));
			
			System.out.println("O aluno: "+nomeMaiorIdade+", tem a maior idade: "+maiorIdade);
			System.out.println("A soma das idades é: "+somaIdades+", a média de idade é: "+mediaIdades);
	
			input.close();
	}
	
}
