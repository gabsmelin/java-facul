package br.com.fiap.padaria.view;
import br.com.fiap.padaria.model.Produto;

public class Terminal {
	public static void main(String[] args) {
		Produto Pd = new Produto();
		
		Pd.setNome("Estouro");
		Pd.setId(1);
		Pd.setPrecoCusto(15);
		Pd.setPrecoVenda(25);
		Pd.setQuantidade(2);
		Pd.setPromocao(false);
		
		//Exibir atributos:
		System.out.println("O nome do produto é: ");
		System.out.println("Digite o valor que deseja adicionar: ");
		System.out.println("Digite o valor que deseja adicionar: ");
		System.out.println("Digite o valor que deseja adicionar: ");
		System.out.println("Digite o valor que deseja adicionar: ");
		System.out.println("Digite o valor que deseja adicionar: ");
		
		
		Pd.atualizarEstoque(48);
		Pd.calcularLucro();
		
	}
}
