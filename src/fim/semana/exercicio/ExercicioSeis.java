package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double saldo = 1000;
		double valorProduto = 0;
		double totalCompras = saldo;
		System.out.println("valor a ser gasto no supermercado é R$ "+saldo+"\n");
		
		while (saldo != 0) {
			System.out.println("valor de saldo R$ "+saldo);
			
			System.out.println("Digite o valor do produto menor que o saldo para compra: ");
			valorProduto = input.nextDouble();
			
			saldo -= valorProduto;
		}
		
		totalCompras -= saldo;
		System.out.println("valor total das compras R$ "+totalCompras);
		System.out.println("valor de troco R$ "+saldo);
		
		
		input.close();
	}
	

}
