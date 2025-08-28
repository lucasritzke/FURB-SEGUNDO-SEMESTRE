package listaExtra;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("nome inválido");
        }
		this.nome = nome;
		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if ( idade < 1 || idade > 130) {
			throw new IllegalArgumentException("idade inválido");
		}
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if ( peso < 1.5 || peso > 500 ) {
			throw new IllegalArgumentException("peso inválido");
		}
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if ( altura < 0.50 || altura > 3.0) {
			throw new IllegalArgumentException("altura inválido");
		}
		this.altura = altura;
	}
	

}
