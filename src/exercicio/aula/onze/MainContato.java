package exercicio.aula.onze;

public class MainContato {

	public static void main(String[] args) {

		Contato contato1 = new Contato(13,"anderson","Costa",36,Genero.MASCULINO);
		
		ContatoRepositorio contRep = new ContatoRepositorio();
		
		//contRep.armazenaContato(contato1.aplicacao());
		
		contRep.removeContatoPorId(contato1.aplicacao(), "anderson", 1);
		
		//System.out.println(contato1.aplicacao());
	}

}
