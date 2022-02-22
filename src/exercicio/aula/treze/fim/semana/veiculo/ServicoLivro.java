package exercicio.aula.treze.fim.semana.veiculo;

import java.util.Scanner;

public class ServicoLivro {
	
	public static void main(String[] args) {
		
		String titulo = null;
		String autor = null;
		String editora = null;
		int numeroDePaginas = 0;
		String pesquisa = null;
		
		Livro livro = new Livro();
	
		Scanner sc = new Scanner(System.in);
		int escolha;
		
		do {
		
			System.out.println("==================================================");
			System.out.println("BEM VINDO A SUA BIBLIOTECA.");
			System.out.println("Digite 1 para NOVO Livro.");
			System.out.println("Digite 2 para CONSULTAR Livro.");
			System.out.println("Digite 3 para SAIR.");		
			System.out.println("==================================================");
			escolha = sc.nextInt();
			
			switch (escolha) {
				case 1:
					System.out.println("Digite o nome do livro");
					titulo = sc.next();
					System.out.println("Digite o nome do autor");
					autor = sc.next();
					System.out.println("Digite o nome da Editora");
					editora = sc.next();
					System.out.println("Digite o numero de paginas");
					numeroDePaginas = sc.nextInt();
					livro.inserirLivro(titulo, autor, editora, numeroDePaginas);
				break;
				
				case 2:
					System.out.println("Digite o nome do titulo a ser pesquisado");
					pesquisa = sc.next();
					System.out.println(livro.pesquisaLivro(pesquisa));
				break;
				
				case 3:
					if(escolha == 3) {
						System.out.println("Você saiu do programa.");
						break;
					
					}
					
				break;
												
				default:
					System.out.println("Você digitou uma opção inválida");
				break;
			}
			
		}while (escolha !=3);
		
		

	}
	
	
}
