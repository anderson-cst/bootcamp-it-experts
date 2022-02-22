package exercicio.aula.treze.fim.semana.veiculo;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	
	private String titulo;
	private String autor;
	private String editora;
	private int numeroDePaginas;
	
	List<Livro> listaLivros = new ArrayList<>();
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}	
	
	@Override
	public String toString() {
		return "Livro - titulo: " + titulo + ", autor(a): " + autor + ", editora: " + editora + ", numeroDePaginas: "
				+ numeroDePaginas + "";
	}
	
	
	public void inserirLivro(String titulo, String autor, String editora, int numeroDePaginas) {
		
		Livro livro = new Livro();
				
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setEditora(editora);
		livro.setNumeroDePaginas(numeroDePaginas);
				
		listaLivros.add(livro);
	}
	
	public List<Livro> pesquisaLivro(String pesquisa){
		List<Livro> pesquisaLivros = new ArrayList<>();
		
		for (Livro livros : listaLivros) {
			if(livros.getTitulo().contains(pesquisa))
				pesquisaLivros.add(livros);
		}		
		return pesquisaLivros;
	}
	

}
