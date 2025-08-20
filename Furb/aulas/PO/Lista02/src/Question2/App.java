package Question2;

public class App {

	public static void main (String []args) {
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		c1.setTitular("Hugo");
		c1.setNumero("1123-3");
		c2.setTitular("Maristela");
		c2.setNumero("3323-4");
		
		c1.depositar(1000);
		c1.depositar(700);
		
		c2.depositar(5000);
		c2.sacar(3000);
		c2.transferir(1800, c1);
		
		System.out.println("Conta: " + c1.getNumero()
	    + "  Titular: " + c1.getTitular() + "  saldo: " + c1.getSaldo());

		System.out.println("Conta: " + c2.getNumero()
		    + "  Titular: " + c2.getTitular() + "  saldo: " + c2.getSaldo());
	}
}
