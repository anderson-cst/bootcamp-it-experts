package exercicio.aula.nove;

import java.util.Scanner;

public class AplicacaoFormas extends Retangulo{
	
	private double base;
	private double altura;		
	private double lado;
	private double valorMaior;
	private double valorMenor;
	private double raio;	
	private boolean i = true;
	
	Scanner input = new Scanner(System.in);

		
	public void executa(int escolha) {	
	
		if (escolha > 0 && escolha <= 2){
			System.out.println("Insira o valor da Base:");
			base = input.nextDouble();
			
			System.out.println("Insira o valor da Altura:");
			altura = input.nextDouble();
			
			if (escolha == 1) {
				Retangulo retangulo = new Retangulo();
				retangulo.calculoFormas(base, altura);
				i = false;
			}
			if (escolha == 2) {
				Triangulo triangulo = new Triangulo();
				triangulo.calculoFormas(base, altura);
				i = false;
			}
			
			
		}else if (escolha == 3) {
			System.out.println("Insira o valor da Diagonal Maior:");
			valorMaior = input.nextDouble();
			
			System.out.println("Insira o valor da Diagonal Menor:");
			valorMenor = input.nextDouble();
			
			Losango losango = new Losango();
			losango.calculoFormas(valorMaior, valorMenor);
			i = false;
			
		}else if (escolha == 4) {
			System.out.println("Insira o valor do Lado do quadrado:");
			lado = input.nextDouble();
			
			Quadrado quadrado = new Quadrado();
			quadrado.calculoQuadrado(lado);
			i = false;
			
	    }else if (escolha == 5) {
	    	System.out.println("Insira o valor da Base Maior:");
			valorMaior = input.nextDouble();
			
			System.out.println("Insira o valor da Base Menor:");
			valorMenor = input.nextDouble();
			
			System.out.println("Insira o valor da Altura:");
			altura = input.nextDouble();
			
			Trapezio trapezio = new Trapezio();
			trapezio.calculaTrapezio(valorMaior, valorMenor, altura);
			i = false;
			
	    }else if (escolha == 6) {
	    	System.out.println("Insira o valor do Raio:");
			raio = input.nextDouble();
			
			Circulo circulo = new Circulo();			
			circulo.calculoCirculo(raio);
			i = false;
			
	    }else if (escolha < 0 || escolha > 6) {
	    	System.out.println("Valor inválido!");
	    }
	}
	
}