package fim.semana.exercicio;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qntdClientes = 0;
		
		System.out.println("Quantos clientes deseja cadastrar?");
		qntdClientes = input.nextInt();
		
		int parcelas = 0;
		int[] codigo = new int[qntdClientes];
		String[] nome = new String[qntdClientes];
		String[] sobrenome = new String[qntdClientes];
		double[] valorTotal = new double[qntdClientes];
		double[] valorParcelas = new double[5];
		int busca = 0;
		
		
		for (int i=0; i < qntdClientes; i++) {
			System.out.println("Insira o código do "+(i+1)+"º cliente:");
			codigo[i] = input.nextInt();
			
			System.out.println("Insira o nome do cliente:");
			nome[i] = input.next();
			
			System.out.println("Insira o sobrenome do cliente:");
			sobrenome[i] = input.next();
			
			System.out.println("Insira o valor da compra:");
			valorTotal[i] = input.nextDouble();
			
			
		
			
			do {
				System.out.println("Valor da compra R$ "+valorTotal[i]+" deseja parcelar em quantas vezes?\n");
				parcelas = input.nextInt();
				
				switch (parcelas) {
				case 1:
					valorParcelas[i] = (valorTotal[i])/1;
					System.out.println("Compra realizada com parcelamento em 1 vezes\n");
				break;
				
				case 2:
					valorParcelas[i] = (valorTotal[i])/2;
					System.out.println("Compra realizada com parcelamento em 2 vezes\n");
				break;
				
				case 3:
					valorParcelas[i] = (valorTotal[i])/3;
					System.out.println("Compra realizada com parcelamento em 3 vezes\n");
				break;
				
				case 4:
					valorParcelas[i] = (valorTotal[i])/4;
					System.out.println("Compra realizada com parcelamento em 4 vezes\n");
				break;
				
				case 5:
					valorParcelas[i] = (valorTotal[i])/5;
					valorParcelas[i] += valorParcelas[i]*0.05;
					System.out.println("Compra realizada com parcelamento em 5 vezes com juros de 5%\n");
				break;
			
				default:
					System.out.println("Opção inválida a compra deve ser parcelada em até 5 vezes.\n");
				}
			}while(parcelas > 5);
			
		}
		
			System.out.println("Qual o código do Cliente que deseja exibir?\n");
			busca = input.nextInt();
			
			System.out.println("Código "+codigo[busca-1]+" Cliente "+nome[busca-1]+
							" "+sobrenome[busca-1]+", valor da parcela da compra: R$ "
							+valorParcelas[busca-1]+", total R$ "+valorTotal[busca-1]);
	
	input.close();
	}

}
