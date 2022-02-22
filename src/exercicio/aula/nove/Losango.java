package exercicio.aula.nove;

public class Losango extends Retangulo {
	
	private double diagonalMaior;
	private double diagonalMenor;
	
		
	public double getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	
	@Override
	public void calculoFormas(double valorUm, double valorDois) {
		this.diagonalMaior = valorUm;
		this.diagonalMenor = valorDois;
		this.area = (this.diagonalMaior * this.diagonalMenor)/2;
		
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "O calculo da área do Losango é: Área = (Diagonal Maior x Diagonal Menor) / 2  |  Área: " + area + " = (" + diagonalMaior + " x " + diagonalMenor + ") / 2";
	}
}
