package br.com.fiap.elevador.model;

public class Elevador {
	int andarAtual;
	int totalAndares;
	int capacidadePessoas;
	int qtdPessoas;
	
	String inicializando() {
		return capacidadePessoas + " | " + totalAndares;
	}
	
	int entra() {
		qtdPessoas = qtdPessoas + 1;
		return qtdPessoas;
	}
	
	int sai() {
		qtdPessoas = qtdPessoas - 1;
		return qtdPessoas;
	}
	
	int sobe() {
		if(andarAtual == 0) {
			System.out.println("Térreo");
		} else if(andarAtual == 1) {
			System.out.println("Primeiro andar");
		} else if(andarAtual == 2) {
			System.out.println("Segundo andar");
		} else if(andarAtual == 3) {
			System.out.println("Terceiro andar");
		} else if(andarAtual == 4) {
			System.out.println("Quarto andar");
		} else if(andarAtual == 1) {
			System.out.println("Quinto andar");
		}
		andarAtual = andarAtual + 1;
		return andarAtual;
	}
	
	int desce() {
		andarAtual = andarAtual - 1;
		return andarAtual;
	}
}
