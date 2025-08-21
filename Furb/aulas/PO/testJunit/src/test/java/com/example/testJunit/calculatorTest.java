package com.example.testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {

	@Test
	void test() {
		int valor1 = 10;
		int valor2 = 20;
		int esperado = 30;
		
		int resultado = calculator.somar(valor1, valor2);
		assertEquals(esperado, resultado);
		
	}

}
