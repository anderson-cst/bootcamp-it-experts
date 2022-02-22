package exercicio.aula.nove;

import java.util.Scanner;

public class MainFormas {

	public static void main(String[] args) {
		
		int escolha;		
		
		Scanner leitor = new Scanner(System.in);
		AplicacaoFormas aplicacao = new AplicacaoFormas();
		
		System.out.println("Selecione a forma para o calculo da área:\n");
		System.out.println("| 1 - Retangulo | 2 - Triângulo | 3 - Losango | 4 - Quadrado | 5 - Trapézio | 6 - Círculo |");
		escolha = leitor.nextInt();
		aplicacao.executa(escolha);
		
		leitor.close();
	}

}
