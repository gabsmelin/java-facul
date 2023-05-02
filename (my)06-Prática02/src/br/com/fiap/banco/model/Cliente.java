package br.com.fiap.banco.model;

public class Cliente {
	String nome, cpf;
	Endereco endereco;
	
	String retornarDados() {
		return nome + " | " + cpf;
		// + " | " + endereco.cep + " | " + endereco.complemento + " | " + endereco.logradouro + " | " + endereco.numero
	}
}
