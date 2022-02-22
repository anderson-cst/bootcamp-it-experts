package exercicio.aula.tres;
import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double precoGasolina = 6.18;
		double precoAlcool = 5.34;
		
		System.out.println("Digite a quantidade de litros:");
		double litros = input.nextDouble();
		
		System.out.println("Digite o combustível desejado | A - álcool | G - gasolina:");
		String combustivel = input.next();
		
		double valorTotal = 0;
		double valorComDesconto = 0;
		
		switch (combustivel) {
			case ("A"):
				valorTotal = (precoAlcool * litros);
				if(litros <= 20) {
					valorComDesconto = valorTotal - ((valorTotal)*3/100);
					System.out.println("O valor a ser pago é: "+ valorComDesconto);
				}else if(litros > 20) {
					valorComDesconto = valorTotal - ((valorTotal)*5/100);
					System.out.println("O valor a ser pago é: "+ valorComDesconto);
				}				
			break;
			
			case ("G"):
				valorTotal = (precoGasolina * litros);
			if(litros <= 20) {
				valorComDesconto = valorTotal - ((valorTotal)*2.6/100);
				System.out.println("O valor a ser pago é: "+ valorComDesconto);
			}else if(litros > 20) {
				valorComDesconto = valorTotal - ((valorTotal)*4.25/100);
				System.out.println("O valor a ser pago é: "+ valorComDesconto);
			}
			break;
			
			default:
				System.out.println("Escolha de combustível inválida");
		}
	input.close();
	}

}
