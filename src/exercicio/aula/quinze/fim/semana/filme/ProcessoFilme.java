package exercicio.aula.quinze.fim.semana.filme;

import java.io.FileNotFoundException;
import java.util.List;

public class ProcessoFilme {

	public static void main(String[] args) throws FileNotFoundException {
		
		ImportaFilme importa = new ImportaFilme();

		List<Filme> filmes = new ImportaFilme().populaListaFilmes();
		
		System.out.println("Listar todos os filmes");
		importa.listarTodosFilmes(filmes);
		System.out.println();
		
		System.out.println("Listar filmes do ano de 2021");
		importa.listarFilmesAno2021(filmes);
		System.out.println();
		
		System.out.println("Listar filme de maior bilheteria");
		importa.maiorBilheteria(filmes);
		System.out.println();
		
		System.out.println("Agrupar por nome do diretor");
		importa.agruparNomeDiretor(filmes);
		System.out.println();
		
		System.out.println("Agrupar por categoria");
		importa.agruparCategoria(filmes);
		System.out.println();		
		
		importa.mediaClassificacao(filmes);
		System.out.println();		
		
		importa.mediaPublico(filmes);	

	}

}
