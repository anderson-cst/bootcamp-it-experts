package exercicio.aula.oito;

import java.util.Scanner;

public class Corredor {

	String nome;
	double km;
	double meta;
	double total;
	int dias = 0;
	String saida = "";
		
	public void correr() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("===========================================================");
		System.out.println("=================PROGRAMA DE META DE CORRIDA===============");
		System.out.println("===========================================================\n");
		
		System.out.println("Entre com o objetivo a ser corrido: ex: (50.5) 50 KILOMETROS E 500 MTRS");
		meta = leitor.nextDouble();
		System.out.println("Entre com o nome do corredor:");
		nome = leitor.next();
						
		do {
			
			dias++;
			
			System.out.println("Digite os quilometros corridos: dia("+ dias +")");
			km = leitor.nextDouble();
			total += km;
			if (km >= 10) {
				System.out.println("Ótimo, continue assim!!!");
				System.out.println("Nome do corredor: "+ nome);
				System.out.println("Total Acumulado: "+ total +" - Continue a correr!");
				System.out.println("Continuar correndo?: (S)sim - (N)não");
				saida = leitor.next();
			}else {
				System.out.println("Nome do corredor: "+ nome);
				System.out.println("Total Acumulado: "+ total +" - Continue a correr!");
				System.out.println("Continuar correndo?: (S)sim - (N)não");
				saida = leitor.next();
			}
									
		}while ((total < meta) && (!(saida.equals("n")) || (saida.equals("N"))));
			
		if ((saida.equals("n")) || (saida.equals("N"))) {
			System.out.println("Nome do corredor: "+ nome);
			System.out.println("Infelizmente você não atingiu seu objetivo, Total acumulado: "+ total +" em "+ dias +" dias.");
			System.out.println("Finalizando o programa.");
		}else {
			System.out.println("Nome do corredor: "+ nome);
			System.out.println("Parabéns você atingiu seu objetivo, Total acumulado: "+ total +" em "+ dias +" dias.");
			System.out.println("Finalizando o programa.");
		}
				
	}
	
	
	
	
	
	
	
}
