package br.com.fiap.veiculo.model;

public class Lancha {
	String modelo;
	int quanidadeLugares, anoFabricacao, quantidadeMotores;
	double comprimento;
	Cor cor;
	
	
	//getters e setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQuanidadeLugares() {
		return quanidadeLugares;
	}
	public void setQuanidadeLugares(int quanidadeLugares) {
		this.quanidadeLugares = quanidadeLugares;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}
	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
}
