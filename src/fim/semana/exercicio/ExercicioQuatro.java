package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String nome = null;
		double salarioFixo = 0;
		double valorVendas = 0;
		double salarioComissao = 0;
		
		
		System.out.println("Digite o nome do vendedor:");
		nome = input.next();
		
		System.out.println("Digite o salário fixo:");
		salarioFixo = input.nextDouble();
		
		System.out.println("Digite o valor total de vendas do mês:");
		valorVendas = input.nextDouble();
		
		salarioComissao = salarioFixo + ((valorVendas)*15/100);
		
		System.out.println("Vendedor: "+nome+"\nSalário fixo: R$ "+salarioFixo+"\nSalário com comissão: R$ "+salarioComissao);

		input.close();
	}

}
