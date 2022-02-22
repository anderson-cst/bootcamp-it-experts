package exercicio.aula.dez;

import java.util.Scanner;

public class Paciente {

	private String nome;
	private String sobreNome;
	private int idade;
	private double peso;
	private double altura;
	private double imc;
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
	

	public void cadastrar(String nome, String sobreNome, int idade, double peso, double altura) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o nome do paciente:");
		nome = sc.next();
		System.out.println("Insira o sobrenome do paciente:");
		sobreNome = sc.next();
		System.out.println("Insira a idade do paciente:");
		idade = sc.nextInt();
		System.out.println("Insira o peso do paciente:");
		peso = sc.nextDouble();
		System.out.println("Insira a altura do paciente:");
		altura = sc.nextDouble();
		
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;		
		
		sc.close();
	}
	
	public void calculoImc() {
		this.imc = this.peso / (this.altura * this.altura);
	}
	
	public void exibeImc() {
		if (imc < 18.5) {
			System.out.println("Paciente: "+nome+" "+sobreNome +", idade: "+idade+", peso: "+peso+", altura: "+altura+", IMC: "+ResultadoImc.MAGREZA.getImcPorExtenso());
		}else if (imc >= 18.5 && imc < 24.9){
			System.out.println("Paciente: "+nome+" "+sobreNome +", idade: "+idade+", peso: "+peso+", altura: "+altura+", IMC: "+ResultadoImc.NORMAL.getImcPorExtenso());
		}else if (imc >= 24.9 && imc < 30) {
			System.out.println("Paciente: "+nome+" "+sobreNome +", idade: "+idade+", peso: "+peso+", altura: "+altura+", IMC: "+ResultadoImc.SOBREPESO.getImcPorExtenso());
		}else System.out.println("Paciente: "+nome+" "+sobreNome +", idade: "+idade+", peso: "+peso+", altura: "+altura+", IMC: "+ResultadoImc.OBESIDADE.getImcPorExtenso());				
	}
}



