package calcularIMC;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		p pessoa = new p();
		Scanner ler = new Scanner (System.in);
		System.out.println("Qual sua altura");
		pessoa.altura = ler.nextDouble();
		System.out.println("Qual seu peso");
		pessoa.peso = ler.nextDouble();
		
		Double IMC = pessoa.calcularIMC();
		System.out.println("Seu IMC e de: " + IMC);
		ler.close();
	}

}
