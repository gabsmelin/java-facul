package br.com.fiap.veiculo.model;

public class Carro {
	private String modelo, placa;
	private int quantidadeLugares, anoFabricacao, quantidadePortas;
	private double comprimento;
	float motor;
	Cor cor;
	
	//getters e setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	//
	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}
	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}
	//
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	//
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	//
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	//
	public float getMotor() {
		return motor;
	}
	public void setMotor(float motor) {
		this.motor = motor;
	}
	//
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
}
