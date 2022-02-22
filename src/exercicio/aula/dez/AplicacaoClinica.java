package exercicio.aula.dez;

public class AplicacaoClinica {

	public static void main(String[] args) {
				
		Paciente paciente = new Paciente();
		
		
		paciente.cadastrar(null, null, 0, 0, 0);
		paciente.calculoImc();
		paciente.exibeImc();
			
		
		
		//for (ResultadoImc val : ResultadoImc.values()) {
			//System.out.println(val.toString());
		//}

	}

}
