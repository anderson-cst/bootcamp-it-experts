package exercicio.aula.nove;

import java.util.Scanner;

public class MainFormas {

	public static void main(String[] args) {
		
		int escolha;		
		
		Scanner leitor = new Scanner(System.in);
		AplicacaoFormas aplicacao = new AplicacaoFormas();
		
		System.out.println("Selecione a forma para o calculo da �rea:\n");
		System.out.println("| 1 - Retangulo | 2 - Tri�ngulo | 3 - Losango | 4 - Quadrado | 5 - Trap�zio | 6 - C�rculo |");
		escolha = leitor.nextInt();
		aplicacao.executa(escolha);
		
		leitor.close();
	}

}
