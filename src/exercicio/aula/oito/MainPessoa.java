package exercicio.aula.oito;

import java.util.Scanner;

public class MainPessoa {

	public static void main(String[] args) {

		String escolha = null;
		int trabalho = 0;
				
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Para cadastrar um homem digite: | H |");
		System.out.println("Para cadastrar uma mulher digite: | M |");
		escolha = leitor.next();		
		
		if (escolha.equals("H") || (escolha.equals("h"))) {
			
			Homem homem = new Homem();
			
			System.out.println("Cadastre nome:");
			homem.setNome(leitor.next());
			
			System.out.println("Cadastre idade:");
			homem.setIdade(leitor.nextInt());
			
			do {
				
				System.out.println("Possui carteira de trabalho: | 1 - sim | 0 - não |");
				trabalho = leitor.nextInt();
				
				if (trabalho == 1) {
					homem.setPossuiCarteiraDeTrabalho(true);
				}else if (trabalho == 0) {
					homem.setPossuiCarteiraDeTrabalho(false);
				}else {
					System.out.println("Favor entrar com um valor válido!");
					leitor.nextLine();
				}													
								
			} while (trabalho > 1);
			
			if (homem.habilitadoTrabalhar(homem.isPossuiCarteiraDeTrabalho(), homem.getIdade()) == true) {
				System.out.println("Habilitado(a) para trabalhar");
			}else System.out.println("Não habilitado(a) para trabalhar idade inválida ou carteira não habilitada");
					
		}else if (escolha.equals("M") || (escolha.equals("m"))) {
			
			Mulher mulher = new Mulher();
			
			System.out.println("Cadastre nome:");
			mulher.setNome(leitor.next());
			
			System.out.println("Cadastre idade:");
			mulher.setIdade(leitor.nextInt());
			
			do {
				
				System.out.println("Possui carteira de trabalho: | 1 - sim | 0 - não |");
				trabalho = leitor.nextInt();
				
				if (trabalho == 1) {
					mulher.setPossuiCarteiraDeTrabalho(true);
				}else if (trabalho == 0) {
					mulher.setPossuiCarteiraDeTrabalho(false);
				}else {
					System.out.println("Favor entrar com um valor válido!");
					leitor.nextLine();
				}													
								
			} while (trabalho > 1);
				
			if (mulher.habilitadoTrabalhar(mulher.isPossuiCarteiraDeTrabalho(), mulher.getIdade()) == true) {
				System.out.println("Habilitado(a) para trabalhar");
			}else System.out.println("Não habilitado(a) para trabalhar idade inválida ou carteira não habilitada");
	
	}
	leitor.close();

  }
	
}
