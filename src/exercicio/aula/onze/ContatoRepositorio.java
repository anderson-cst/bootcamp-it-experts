package exercicio.aula.onze;

import java.util.*;

public class ContatoRepositorio extends Repositorio {

	@Override
	public void armazenaContato(List<Contato> listaContato) {
		System.out.println("Foram inseridos "+listaContato.size()+" contatos com sucesso!");		
	}
	

	@Override
	public void removeContatoPorId(List<Contato> listaContato, String nome, Integer id) {
		//Iterator<Contato> iterator = listaContato.iterator();
		
		/*
		 * if (listaContato.get(id).getId() == id) {
		 * System.out.println(listaContato.get(id).getId() == id); }
		 */
		
			
		/*
		 * for (Contato value : listaContato){ if (value.getId() == id &&
		 * value.getNome().equalsIgnoreCase(nome)) { listaContato.remove(value); } }
		 */
			
			
			Iterator<Contato> it = listaContato.iterator();
			
			while (it.hasNext()) {
				Contato busca = it.next();
				if (busca.getId() ==  (id)) {
					listaContato.remove(busca);
			    }
				
				
			}
			/*
			 * for (int i = 0; i < listaContato.size(); i++) { if (listaContato.contains(id)
			 * && listaContato.contains(nome)) { listaContato.remove(listaContato.); } }
			 */
	
	            
			for (Contato value1 : listaContato){ 
				System.out.println(value1);
			}
	
	}
	
}
