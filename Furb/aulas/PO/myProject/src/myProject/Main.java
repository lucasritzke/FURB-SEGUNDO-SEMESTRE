package myProject;

public class Main {

	public static void main(String[] args) {
		Gato g = new Gato();
		g.nome = "Amarelindo";
		g.peso = "110.5";
		
		System.out.println("NOme: " + g.nome + ", Peso: " + g.peso );
		System.out.println(g.miar());
	}

}
