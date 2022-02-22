package exercicio.aula.nove;

public class Retangulo implements Formas {

	protected double area;
	protected double base;
	protected double altura;
	
		
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

	@Override
	public String toString() {
		return "O calculo da área do Retangulo é: | Área = (Base x Altura) | Área: " + area + " = (" + base + " x " + altura + ")";
	}
	

	@Override
	public void calculoFormas(double valorUm, double valorDois) {
		this.base = valorUm;
		this.altura = valorDois;
		this.area = this.base * this.altura;
		
		System.out.println(toString());
	}

	
	
	
	
	
	
	
	
	

}
