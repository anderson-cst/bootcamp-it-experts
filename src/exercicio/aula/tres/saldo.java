package exercicio.aula.tres;
import java.util.Scanner;

public class saldo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta:");
		int numeroConta = input.nextInt();
		
		System.out.println("Digite o saldo:");
		double saldo = input.nextDouble();
		
		System.out.println("Digite o valor de débito:");
		double debito = input.nextDouble();
		
		System.out.println("Digite o valor de crédito:");
		double credito = input.nextDouble();
		
		double saldoAtual = 0;
		saldoAtual = saldo - debito + credito;
		//System.out.println("Saldo Atual = "+ saldoAtual +" | saldo: "+ saldo +" - debito: "+ debito +" + credito "+ credito);
		System.out.println("Saldo Atual: "+saldoAtual+" = "+saldo+" - "+debito+" + "+credito);
		
		if (saldoAtual >= 0) {
			System.out.println("Saldo Positivo!");
		}else 
			System.out.println("Saldo Negativo!");

	}

}
