package exercicio.aula.tres;
import java.util.Scanner;

public class regiao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite sua regi�o: | Sul, Sudeste, Centro-Oeste, Norte, Nordeste |");
		//System.out.println("\n");
		String regiao = leitor.next();
		System.out.println("Digite a temperatura:");
		//System.out.println("\n");
		int temperatura = leitor.nextInt();
		
		if ((temperatura >=0) && (temperatura <= 15)) {
			System.out.println("Muito frio na regi�o "+ regiao);
		}else if ((temperatura >=16) && (temperatura <= 20)) {
			System.out.println("Frio moderado na regi�o "+ regiao);
		}else if ((temperatura >=21) && (temperatura <= 25)) {
			System.out.println("Clima moderado na regi�o "+ regiao);
		}else if ((temperatura >=26) && (temperatura <= 35)) {
			System.out.println("Clima quente na regi�o "+ regiao);
		}else if (temperatura > 35) {
			System.out.println("Clima muito quente na regi�o "+ regiao);
		}leitor.close();
  }

}