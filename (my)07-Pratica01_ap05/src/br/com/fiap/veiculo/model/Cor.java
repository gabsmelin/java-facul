package br.com.fiap.veiculo.model;

public class Cor {
	private String nome;
	private int r, g, t;
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	//
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	//
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	////////////////////////////
	
	public void alterarCor(String nomeNovo, int rNovo, int gNovo, int tNovo) {
		nome = nomeNovo;
		r = rNovo;
		g = gNovo;
		t = tNovo;
	}
}
