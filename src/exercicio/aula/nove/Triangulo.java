package exercicio.aula.nove;

public class Triangulo extends Retangulo {

	@Override
	public void calculoFormas(double valorUm, double valorDois) {
		this.base = valorUm;
		this.altura = valorDois;
		this.area = (this.base * this.altura)/2;
		
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "O calculo da área do Triângulo é: Área = (Base x Altura) / 2  |  Área: " + area + " = (" + base + " x " + altura + ") / 2";
	}	
}
