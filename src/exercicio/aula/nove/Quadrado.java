package exercicio.aula.nove;

public class Quadrado extends Retangulo {
	
	private double lado;
		
		
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	

	public void calculoQuadrado(double lado){
		this.lado = lado;
		this.area = Math.pow(this.lado, 2);
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "O calculo da �rea do Quadrado �: �rea = (Lado)�  |  �rea: "+ area + " = ("+ lado +")�";
	}
	
	

}
