package exercicio.aula.quatro;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		
		int numero = 1;
			
		for (int j = 1; j <= 20; j++) {
			
			int contador = 0;
			
			for (int i = 1; i <= numero; i++) {
				
				if (numero % i == 0) {
					contador++;
				}
							
			}
				if (contador == 2) {
					System.out.println("O numero "+numero+" é primo");
				}
				
			numero++;
		}

	}

}
