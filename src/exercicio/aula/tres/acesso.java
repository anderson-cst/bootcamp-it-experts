package exercicio.aula.tres;
import java.util.Scanner;

public class acesso {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		int codigoUsuario = 1234;
		int senha = 9999;
		
		int codigoInserido = 0;
		int senhaInserida = 0;
		
		System.out.println("Digite o código de usuário:");
		codigoInserido = input.nextInt();
		
		if (codigoInserido == codigoUsuario) {
			System.out.println("Digite a senha:");
			senhaInserida = input.nextInt();
			if (senhaInserida == senha) {
				System.out.println("Acesso Permitido");				
			}else System.out.println("Senha Incorreta");
		}else System.out.println("Usuário Inválido");
	
		input.close();
	}

}
