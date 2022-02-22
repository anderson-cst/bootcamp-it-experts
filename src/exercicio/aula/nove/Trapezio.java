package exercicio.aula.nove;

public class Trapezio extends Retangulo {
	
	private double baseMaior;
	private double baseMenor;
	
	
	public double getBaseMaior() {
		return baseMaior;
	}
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	
	public void calculaTrapezio(double baseMaior, double baseMenor, double altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
		
		this.area = ((this.baseMaior + this.baseMenor) * this.altura) / 2;
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "O calculo da área do Trapézio é: Área = ((Base Maior + Base Menor) x Altura) / 2 |  Área: " + area + " = ((" + baseMaior + " + " + baseMenor + ") x " + altura + ") / 2";
	}
	
	

}
