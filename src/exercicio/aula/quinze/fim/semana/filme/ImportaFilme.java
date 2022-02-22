package exercicio.aula.quinze.fim.semana.filme;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ImportaFilme {
	

	public List<Filme> populaListaFilmes() throws FileNotFoundException {
		
		String arquivoFilmes = "C:\\Users\\user\\Documents\\CITI IT EXPERTS\\JAVA\\filmes.txt";
		
		List<Filme> listaFilmes = new ArrayList<>();
		
		
			BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoFilmes));
			
			String linha;
			
			try {
				while ((linha = bufferedReader.readLine()) != null) {
					
					List<String> dados = new ArrayList<>(Arrays.asList(linha.split(";")));
					
					Filme filmes = new Filme();
					
					filmes.setTitulo(dados.get(0));
					filmes.setNomeDiretor(dados.get(1));
					filmes.setGenero(dados.get(2));
					filmes.setUf(dados.get(3));
					filmes.setDuracaoMinutos(Integer.valueOf(dados.get(4)));
					filmes.setAnoLancamento(Integer.valueOf(dados.get(5)));
					filmes.setClassificacao(Integer.valueOf(dados.get(6)));
					filmes.setTotalPublico(Integer.valueOf(dados.get(7)));
					filmes.setSinopse(dados.get(8));
					
					listaFilmes.add(filmes);					
					
					
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return listaFilmes;		
	}

	
	public void listarTodosFilmes(List<Filme> listaFilmes) {
		
		List<Filme> streamFilmes = listaFilmes.stream()
				.collect(Collectors.toList());
		
		streamFilmes.forEach(System.out::println);			
	}
	
	
	public  void listarFilmesAno2021(List<Filme> listaFilmes) {
		
		List<Filme> streamFilmes = listaFilmes.stream()
				.filter(p -> p.getAnoLancamento() == 2021)
				.collect(Collectors.toList());
		
		streamFilmes.forEach(System.out::println);		
	}
	
	
	public void maiorBilheteria(List<Filme> listaFilmes) {
		
		Optional<Filme> streamFilmes = listaFilmes.stream()
				.max(Comparator.comparing(Filme::getTotalPublico));
		
		System.out.println(streamFilmes);
	}
	
	
	public void agruparNomeDiretor(List<Filme> listaFilmes) {
		
		List<Filme> streamFilmes = listaFilmes.stream()
				.sorted(Comparator.comparing(Filme::getNomeDiretor))
				.collect(Collectors.toList());		
		
		streamFilmes.forEach(System.out::println);
	}
	
	
	public void agruparCategoria(List<Filme> listaFilmes) {
		
		List<Filme> streamFilmes = listaFilmes.stream()
				.sorted(Comparator.comparing(Filme::getGenero))
				.collect(Collectors.toList());
		
		streamFilmes.forEach(System.out::println);		
	}
	
	
	public void mediaClassificacao(List<Filme> listaFilmes) {
		
		double streamFilmes = listaFilmes.stream()
				.mapToInt(p -> p.getClassificacao())
				.average().getAsDouble();
		
		System.out.println("Calculo média da classificacao com todos os filmes: "+ streamFilmes);
	}
	
	
	public void mediaPublico(List<Filme> listaFilmes) {
		
		double streamFilmes = listaFilmes.stream()
				.mapToInt(p -> p.getTotalPublico())
				.average().getAsDouble();
		
		System.out.println("Calculo média Público de todos os filmes: "+ streamFilmes);
	}
	
	
	
}
