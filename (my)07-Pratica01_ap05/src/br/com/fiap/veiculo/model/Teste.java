package br.com.fiap.veiculo.model;

public class Teste {
	public static void main(String[] args) {
		Carro c = new Carro();
		Cor cor = new Cor();
		
		c.setModelo("Gol");
		c.setPlaca("000-GGG");
		c.setQuantidadeLugares(5);
		c.setQuantidadePortas(4);
		c.setAnoFabricacao(2010);
		c.setComprimento(3.899);
		c.setMotor(1);
		
		cor.setNome("Preto");
		cor.setR(0);
		cor.setG(0);
		cor.setT(0);
		cor.alterarCor("Branco", 1, 1, 1);
		
		System.out.println("Modelo: " + c.getModelo() +
				 		   " | Placa: " + c.getPlaca());
		System.out.println("Quantidade de lugares: " + c.getQuantidadeLugares() +
				 		   " | Quantidade de portas: " + c.getQuantidadePortas());
		System.out.println("Ano de fabricacao: " + c.getAnoFabricacao() +
				 		   " | Comprimento: " + c.getComprimento());
		System.out.println("Motor: " + c.motor + 
				 		   " | Cor: " + cor.getNome() + "(#" + cor.getR() + cor.getG() + cor.getT() + ")");
	}
}
