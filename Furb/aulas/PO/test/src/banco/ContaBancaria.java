package banco;

public class ContaBancaria {
	String titular;
	double saldo;
	public void sacar (double valor) {
		saldo -= valor;
	}
	public void depositar (double valor) {
		saldo += valor;
	}
		
}
