package com.exemplo.potato;

public class Auto {
	private Pessoa motorista;
	private String marca;
	
	public Auto(String marca, Pessoa motorista) {
		setMarca(marca);
		setMotorista(motorista);
	}
	
	public Pessoa getMotorista() {
		return motorista;
	}
	public void setMotorista(Pessoa motorista) {
		if (motorista == null) {
            throw new IllegalArgumentException("motorista inválido");
        }
		this.motorista = motorista;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("nome inválido");
        }
		this.marca = marca;
	}

}
