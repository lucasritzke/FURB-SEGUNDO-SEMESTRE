package com.exemplo.potato;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Pessoa p = new Pessoa("Algebrio");
    	Auto auto = new Auto("BYD", p);
    	
    	System.out.println("Motorista: " + auto.getMotorista().getNome());
    	
    }
}
