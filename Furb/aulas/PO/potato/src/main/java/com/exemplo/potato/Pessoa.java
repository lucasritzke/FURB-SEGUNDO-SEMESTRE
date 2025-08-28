package com.exemplo.potato;

public class Pessoa {
	private String Nome;
	
	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("nome inválido");
        }
		this.Nome = nome;
		
	}
	public Pessoa(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return Nome;
	}
	
	

}
