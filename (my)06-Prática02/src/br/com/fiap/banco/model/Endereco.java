package br.com.fiap.banco.model;

public class Endereco {
	String logradouro, cep, complemento;
	short numero;
	
	String retornarEndereco() {
		return logradouro + " | " + cep + " | " + complemento + " | " + numero;
	}
}
