package exercicio.aula.quatro;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double media=0;
		String nome=null;
		double nota=0;
			
		System.out.println("Digite o nome do aluno(a):");
		nome = input.next();
		
		for (int i=1; i<3; i++) {
			
			System.out.println("Digite a nota do aluno(a):");
			nota = input.nextDouble();
			
			media += nota;
			media /= i;
			
			System.out.println("nota "+nota+" media "+media+" cont "+i);
		}
		
		
		if (media>=7) {
			System.out.println("aluno(a): "+nome+" aprovado, média: "+ media);
		}else if ((media >= 4) && (media < 7)) {
			System.out.println("Aluno(a): "+nome+" ficou de recuperação, média: "+ media);
		}else if (media <4) {
			System.out.println("Aluno(a): "+nome+" reprovado, média: "+ media);
	    }
		
	 input.close();

     }
}
