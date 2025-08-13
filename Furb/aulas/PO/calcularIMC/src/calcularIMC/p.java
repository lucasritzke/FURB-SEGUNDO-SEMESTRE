package calcularIMC;

public class p {
	
	double peso;
	double altura;
	public double calcularIMC() {
		double IMC = peso / (altura * altura);
		return IMC;
	}
}
