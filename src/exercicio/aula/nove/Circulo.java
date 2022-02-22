package exercicio.aula.nove;

public class Circulo extends Retangulo{
	
	private final double PI = 3.14;
	private double raio;
	
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getPi() {
		return PI;
	}
	
	public void calculoCirculo(double raio) {
		this.raio = raio;
		this.area = PI * Math.pow(this.raio, 2);
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "O calculo da área do Circulo é: Área = PI x raio²  |  Área: " + area + " = " + PI + " x " + raio + "²";
	}

	
	
}
