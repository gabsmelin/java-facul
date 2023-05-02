package br.com.fiap.padaria.model;

public class Produto {
	private int id;
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private int quantidade;
	private boolean promocao;
	
	public double calcularLucro() {
		double calculo = precoVenda - precoCusto;
		return calculo;
	}
	
	public void atualizarEstoque(int qtd) {
		quantidade += qtd;
	}
	
	//getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	//
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	//
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	
}
