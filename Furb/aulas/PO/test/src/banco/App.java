package banco;

public class App {
	public static void main(String[] args) {
	//	ContaBancaria conta = new ContaBancaria();
	//	conta.titular = "Lucas";
	//	conta.depositar(200);
	//	conta.sacar(100);
	//	System.out.println(conta.saldo);
	Pessoa p = new Pessoa();
	p.setNome("Lucas");
	p.getPeso(-80);
	System.out.println(p.getPeso);
	}
}
