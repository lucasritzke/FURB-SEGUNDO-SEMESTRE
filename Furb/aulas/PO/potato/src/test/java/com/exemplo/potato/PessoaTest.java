package com.exemplo.potato;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	void testNomeInvalido() {
		String nome = "";
		
		String mensagemEsperada = "Nome invalido";
		Exception ex = assertThrows(IllegalArgumentException.class, 
				() -> {
					Pessoa p = new Pessoa(nome);
				});
		assertEquals(mensagemEsperada, ex.getLocalizedMessage());
	}

}
